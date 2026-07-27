# JavaPractice
Javaの学習記録をまとめたリポジトリです。

## 学習目的

- Javaの基礎力を身に付ける
- Git/GitHubの操作に慣れる
- Webアプリケーション開発に必要な知識を身に付ける

## 開発環境

- Java　21
- Eclipse Pleiades
- Git
- GitHub

# 学習内容

- 基本文法
- 条件分岐
- 繰り返し
- 配列
- メソッド
- クラス
- 継承
- 例外処理

# 今後追加予定
- Servlet
- JSP
- JDBC
-SQL
Webアプリケーション

# BMI健康診断Webアプリ（MVC）

## 概要
Java(Servlet/JSP)を使用して開発したBMI計算Webアプリです。

ユーザーが身長(cm)と体重(kg)を入力すると、BMI値を計算して診断結果を表示します。

---
##使用技術

- Java
- Servlet
- JSP
- JDBC
- MySQL
- HTML
- CSS
- Apache Tomcat 11
- Eclipse
- Git / GitHub

---
## 機能

- ログイン認証（MySQL）
- セッション管理
- ログアウト機能
- 身長・体重入力
- BMI計算
- BMI判定表示
- MVCモデルによる実装
---

## システム構成（MVC）

```text
ブラウザ
   │
   ▼
LoginServlet
   │
   ▼
UserDao
   │
   ▼
MySQL

認証成功
   │
   ▼
Session
   │
   ▼
input.jsp
   │
   ▼
HealthServlet
   │
   ▼
BmiModel
   │
   ▼
bmi.jsp
```

---

## 画面

#### ログイン画面

<img width="950" height="500" alt="スクリーンショット 2026-07-27 143540" src="https://github.com/user-attachments/assets/ce2fae24-6b56-4666-a14c-c2a95f05a2aa" />


### 入力画面

<img width="938" height="488" alt="スクリーンショット 2026-07-15 125314" src="https://github.com/user-attachments/assets/d1e0c4e0-dfe4-4328-8b17-c0faf918c741" />

### 診断結果

<img width="956" height="499" alt="スクリーンショット 2026-07-15 125345" src="https://github.com/user-attachments/assets/0d441c01-1cb5-462a-932e-94be289cdf09" />


## 今後追加したい機能

- 新規ユーザー登録
- BMI履歴保存
- BMI履歴削除
- ユーザー情報編集
- パスワード暗号化
- 入力値バリデーション強化

## 学習内容

本アプリでは以下の技術を学習・実装しました。

- Servlet / JSPによるMVCアーキテクチャ
- JDBCを利用したMySQLとの接続
- DAOパターンによるデータアクセス
- Sessionを利用したログイン認証
- ログアウト処理
- セッションによるアクセス制御
- Git / GitHubによるバージョン管理

- ## ポートフォリオとして工夫した点

- MVCモデルを意識した設計
- DAOパターンを用いたデータベースアクセス
- MySQLによるユーザー認証機能
- Sessionを利用したログイン管理
- 未ログイン時の画面アクセス制御
- GitHubで継続的に機能追加・コミット履歴を管理
