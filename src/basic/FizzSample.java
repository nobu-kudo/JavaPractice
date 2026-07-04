package basic;

public class FizzSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int score = 1; score <= 100; score++) {
			if(score % 3 == 0) {
				//10の倍数の時
				System.out.println("Fizz");
			}else {
				System.out.println(score);
			}
		}
	}



	}
