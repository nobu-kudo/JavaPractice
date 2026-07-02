package basic;

import java.util.Random;

public class IfRandomSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random random = new Random();
		int score = random.nextInt(101);//0～100
		System.out.println("点数" + score);
		
		if(score >= 60) {
			System.out.println("合格です");
		}else {
			System.out.println("不合格です");
		}
	}

}
