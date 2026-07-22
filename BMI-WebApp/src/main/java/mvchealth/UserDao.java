package mvchealth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	
	public User login(String loginId, String password ) {
		
		// ログインに成功したユーザー情報を格納する変数
	    // 最初は何も入っていないので null
		User user =null;
		
		try {
		// MySQLデータベースへ接続	
			Connection con = DriverManager.getConnection(
				    "jdbc:mysql://localhost:3306/bmi_app",
				    "root",
				    "1234");
		
	    // ログインIDとパスワードが一致するユーザーを検索するSQL
	    // ? は後から値をセットするプレースホルダー
			String sql ="SELECT * FROM users WHERE login_id = ? AND password = ?";
		// SQLを実行するためのPreparedStatementを作成
			PreparedStatement ps = con.prepareStatement(sql);
				
		// 1つ目の ? にログインIDをセット
		ps.setString(1, loginId);

		// 2つ目の ? にパスワードをセット
		ps.setString(2, password);
		
		// SQLを実行し、検索結果を取得
		ResultSet rs = ps.executeQuery();
		
		// ユーザーが見つかった場合
		if (rs.next()) {
		// Userオブジェクトを作成
		user = new User();

		// ユーザーIDを取得
		user.setId(rs.getInt("id"));

		// ログインIDを取得
		user.setLoginId(rs.getString("login_id"));

		// パスワードを取得
		user.setPassword(rs.getString("password"));

		// 名前を取得
		user.setName(rs.getString("name"));
		}
		// ResultSetを閉じる
		rs.close();

		// PreparedStatementを閉じる
		ps.close();

		// データベース接続を閉じる
		con.close();
		}
		
		catch (Exception e) {
		// エラーが発生した場合は内容をコンソールへ表示
		    e.printStackTrace();
		    
		}
		
		// ログイン成功ならUserオブジェクト
	    // 失敗ならnullを返す
		return user;
	}

}
