package basic;

public class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score ;
	}
	public void showInfo() {

		System.out.println("名前" + this.name);
		System.out.println("点数" + this.score);
		
		
	}

}
