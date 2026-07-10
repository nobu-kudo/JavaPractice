package basic;

public class ArrayCountSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] score = { 50, 80, 70, 90, 60};
		int count = 0;
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
		if (score[i] >= 80) {
			count++;
			sum = sum + score[i];
		System.out.println((i + 1) + "番目" + score[i] + "点(合格)");
		}
		}
		System.out.println("合格者数" + count + "人");
		System.out.println("80点以上の合計" + sum + "点");
		
	}

}
