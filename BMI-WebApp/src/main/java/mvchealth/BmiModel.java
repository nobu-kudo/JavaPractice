package mvchealth;

public class BmiModel {
	// BMI値を求めて返すメソッドの定義
		// 引数は文字列型の身長と体重
		public double calcBmi(String heightStr, String weightStr) {
			// 身長と体重が文字列なので、double型に変換
			double height = Double.parseDouble(heightStr); // 身長
			double weight = Double.parseDouble(weightStr); // 体重
			// 身長はcmだが、BMI計算ではmで行う。cm⇒mに変換
			height = height / 100;
			
			// BMI値を計算して返す
			double bmi = weight / Math.pow(height, 2);

			// 小数第2位で四捨五入
			bmi = Math.round(bmi * 100) / 100.0;

			// 四捨五入したBMIを返す
			return bmi;				
		}
	}


