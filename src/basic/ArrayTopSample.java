package basic;

public class ArrayTopSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	int[] score = {50, 80, 70, 90, 60};
	int max = score[0];
	int index = 0;
	int count = 0;
	int sum = 0;
	int avg = 0;
	for(int i = 0; i < score.length; i++) {
		//最大値の処理
		if(score[i] > max) {
			max = score[i];
			//indexの更新
			index = i;
		}
		if(score[i] >= 80) {
			//80点を超えた人の参照
			System.out.println("合格者:" + (i+1) + "番目の人");
			//人数の更新
			count++;
			//８０点以上の合計点数
			sum = sum + score[i];
		}
	}
			//合計点の平均点
			avg = sum / count;
	System.out.println("最高得点;" + max+ "点");
	System.out.println((index + 1) + "番目の人");
	System.out.println("合格者数" + count + "人");
	System.out.println("合格者合計点" + sum + "点");
	System.out.println("合格者平均点" + avg + "点");
	}

}
