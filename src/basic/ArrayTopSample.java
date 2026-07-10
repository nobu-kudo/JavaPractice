package basic;

public class ArrayTopSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	int[] score = {50, 80, 70, 90, 60};
	int max = score[0];
	int index = 0;
	
	for(int i = 0; i < score.length; i++) {
		if(score[i] > max) {
			max = score[i];
			index = i;
		}
	}
	System.out.println("最高得点;" + max+ "点");
	System.out.println((index + 1) + "番目の人");
	
	}

}
