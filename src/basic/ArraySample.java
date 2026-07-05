package basic;

public class ArraySample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] score = { 50, 80, 70, 90, 60};
		int sum = 0;
		int avg = 0;
		System.out.println(score.length);
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
			avg = sum / score.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
