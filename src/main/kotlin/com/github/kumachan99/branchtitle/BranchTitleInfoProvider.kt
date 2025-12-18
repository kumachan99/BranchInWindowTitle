package com.github.kumachan99.branchtitle

import com.intellij.openapi.Disposable
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.impl.TitleInfoProvider
import git4idea.repo.GitRepository
import git4idea.repo.GitRepositoryChangeListener
import git4idea.repo.GitRepositoryManager

class BranchTitleInfoProvider : TitleInfoProvider {

    override val borderlessPrefix: String = "["
    override val borderlessSuffix: String = "]"

    override fun isActive(project: Project): Boolean {
        return getCurrentBranchName(project) != null
    }

    override fun getValue(project: Project): String {
        return getCurrentBranchName(project) ?: ""
    }

    override fun addUpdateListener(project: Project, disp: Disposable, value: (provider: TitleInfoProvider) -> Unit) {
        // Subscribe to Git repository changes
        val connection = project.messageBus.connect(disp)
        connection.subscribe(GitRepository.GIT_REPO_CHANGE, GitRepositoryChangeListener {
            value(this)
        })
    }

    private fun getCurrentBranchName(project: Project): String? {
        return try {
            val repositoryManager = GitRepositoryManager.getInstance(project)
            val repository = repositoryManager.repositories.firstOrNull() ?: return null

            repository.currentBranchName ?: run {
                repository.currentRevision?.take(7)?.let { "detached:$it" }
            }
        } catch (e: Exception) {
            null
        }
    }
}
