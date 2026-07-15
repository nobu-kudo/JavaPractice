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

## 使用技術

- Java
- Servlet
- JSP
- HTML5
- CSS3
- Apache Tomcat 11
- Eclipse
- Git / GitHub

---

## 機能

- 身長・体重入力
- BMI値の計算
- BMI値を小数第2位で四捨五入
- 診断結果画面表示
- MVCモデルによる実装

---

## システム構成（MVC）

```
ブラウザ
    │
    ▼
HealthServlet（Controller）
    │
    ▼
BmiModel（Model）
    │
    ▼
bmi.jsp（View）
```

---

## 画面

### 入力画面

<img width="938" height="488" alt="スクリーンショット 2026-07-15 125314" src="https://github.com/user-attachments/assets/d1e0c4e0-dfe4-4328-8b17-c0faf918c741" />

### 診断結果

<img width="956" height="499" alt="スクリーンショット 2026-07-15 125345" src="https://github.com/user-attachments/assets/0d441c01-1cb5-462a-932e-94be289cdf09" />


## 今後追加したい機能

- 入力値のバリデーション
- BMI判定（低体重・普通体重・肥満）
- MySQLへの保存
- 履歴表示
- ログイン機能
