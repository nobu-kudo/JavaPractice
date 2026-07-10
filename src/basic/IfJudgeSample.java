package basic;

public class IfJudgeSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	int[] score = {50, 80, 70, 90, 100};
	
	for (int i = 0; i < score.length; i++){
		
		if(score[i] >= 80) {
		System.out.println((i+1) + "番目" + score[i] + "点合格");	
		}
		else if(score[i] >= 60) {
		System.out.println((i+1) + "番目" + score[i] + "点追試");
		}
		else {
		System.out.println((i+1) + "番目" + score[i] + "点不合格");
		}
	}
	
	
	}

}
