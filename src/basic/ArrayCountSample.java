package basic;

public class ArrayCountSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] score = { 50, 80, 70, 90, 60};
		int count = 0;
		for(int i = 0; i < score.length; i++) {
		if (score[i] >= 80) {
			count++;
		}
		}
		System.out.println("80点以上の人数" + count + "人");
		
	}

}
