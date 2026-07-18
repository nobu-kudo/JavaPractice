package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInputSample {

	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		
		//名前の入力
		String name = "";
		
		while (name.trim().isEmpty()) {
		System.out.println("名前を入力してください");
		name = scanner.nextLine();
		}
		//点数の入力
		int score = -1;
		
		while(score < 0 || score > 100) {
		System.out.println("点数を入力してください");
		score = scanner.nextInt();
		
			
		}
		
		StudentCapsule student = new StudentCapsule(name, score);
		student.showInfo();
		}catch(InputMismatchException e){
			System.out.println("点数は数字で入力してください");
		}
	}

}
