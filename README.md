# Branch in Window Title

JetBrains IDE (GoLand 2025.3+) プラグイン。ウィンドウタイトルバーに現在のGitブランチ名を表示します。

## 機能

- ウィンドウタイトルにGitブランチ名を表示
- ブランチ切り替え時に自動更新
- 複数プロジェクトウィンドウに対応
- detached HEAD状態ではコミットハッシュを表示
- 非Gitプロジェクトでは通常のタイトルを表示

## 表示形式

```
プロジェクト名 [ブランチ名] - ファイル名
```

例: `my-project [feature/user-auth] - main.go`

## 動作環境

- GoLand 2025.3 以降
- IntelliJ Platform 2025.3 (253.*)

## インストール

### 方法1: JARファイルからインストール

1. [Releases](https://github.com/your-username/branch-window-title/releases) から最新の `.zip` ファイルをダウンロード
2. GoLand を開く
3. `Settings` → `Plugins` → 歯車アイコン → `Install Plugin from Disk...`
4. ダウンロードしたファイルを選択
5. IDEを再起動

### 方法2: ソースからビルド

```bash
# リポジトリをクローン
git clone https://github.com/your-username/branch-window-title.git
cd branch-window-title

# ビルド
./gradlew buildPlugin

# プラグインは build/distributions/ に生成されます
```

## 開発

### 必要環境

- JDK 21
- Gradle 8.x

### ビルド

```bash
./gradlew build
```

### IDEで実行（デバッグ）

```bash
./gradlew runIde
```

### プラグインのパッケージング

```bash
./gradlew buildPlugin
```

## ライセンス

MIT License
