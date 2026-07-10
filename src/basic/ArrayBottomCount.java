package basic;

public class ArrayBottomCount {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] score = {50, 80, 50, 90, 60};
		int min = score[0];
		int index = 0; 
		int count = 0;
		int max = 0;
		
		for(int i = 0; i < score.length; i++) {
			//最低点数の表示
			if(score[i] < min) {
			min = score[i];
		}
			if(score[i] > max) {
			max = score[i];	
			}
		}
		for(int i = 0; i < score.length; i++) {
			if(score[i] == min) {
			count++;
			System.out.println("最低点数者:" + (i+1) + "番目の人");
			}
		}
		int diff = max - min;
		System.out.println("最高点数:" + max + "点");
		System.out.println("最低点数:" + min + "点");
		System.out.println("点差:" + diff + "点");
		System.out.println("最低点の人数" + count + "人");
	}

}

