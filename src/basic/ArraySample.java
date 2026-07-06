package basic;

public class ArraySample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] score = { 50, 80, 70, 90, 60};
		int sum = 0;
		int avg = 0;
		int max = score[0];
		int min = score[0];
		//要素の取り出し
		System.out.println("要素数:" + score.length);
		
		for(int i = 0; i < score.length; i++) {
			//合計の処理
			sum = sum + score[i];
			//最大値の処理
			if(score[i] > max) {
				max = score[i];
			//最小値の処理
			if(score[i] < min) {
				min = score[i];
			//平均の処理
			avg = sum / score.length;
			}

			}
		}
		//合計・平均の出力
		System.out.println("合計:" + sum);
		System.out.println("平均:" + avg);
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);
	}

}
