package basic;

public class FizzBuzzSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int score = 1; score <= 100; score++) {
			if(score % 15 == 0) {
				System.out.println("FizzBuzz");
			}else if(score % 3 == 0){
				System.out.println("Fizz");
			}else if(score % 5 == 0) {
				System.out.println("Buzz");
			}
			else {	
				System.out.println(score);
			}
	}

}
}
