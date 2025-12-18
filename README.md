# Branch in Window Title

JetBrains IDE plugin that displays the current Git branch name in the window title bar.

## Features

- Display Git branch name in window title
- Auto-update when switching branches
- Support multiple project windows
- Show commit hash in detached HEAD state
- Gracefully handle non-Git projects

## Supported IDEs

All JetBrains IDEs with Git integration (build 253.*):
- IntelliJ IDEA
- GoLand
- WebStorm
- PyCharm
- PhpStorm
- RubyMine
- CLion
- Rider
- etc.

## Installation

### From JetBrains Marketplace

1. Open your IDE
2. Go to `Settings` → `Plugins` → `Marketplace`
3. Search for "Branch in Window Title"
4. Click `Install`
5. Restart IDE

### From Disk

1. Download the latest `.zip` file from [Releases](https://github.com/kumachan99/BranchInWindowTitle/releases)
2. Open your IDE
3. Go to `Settings` → `Plugins` → ⚙️ → `Install Plugin from Disk...`
4. Select the downloaded file
5. Restart IDE

## Building from Source

### Requirements

- JDK 21
- Gradle 8.x

### Build

```bash
git clone https://github.com/kumachan99/BranchInWindowTitle.git
cd BranchInWindowTitle

./gradlew buildPlugin
```

The plugin will be generated in `build/distributions/`.

### Run IDE with Plugin (Debug)

```bash
./gradlew runIde
```

## License

MIT License - see [LICENSE](LICENSE) file.
