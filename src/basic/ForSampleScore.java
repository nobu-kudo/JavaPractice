package basic;

public class ForSampleScore {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int score = 1; score <= 100; score++) {
			if(score % 10 == 0) {
				//10の倍数の時
				System.out.println(score +"★");
			}else {
				System.out.println(score);
			}
		}
	}

}
