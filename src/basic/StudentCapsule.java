package basic;

public class StudentCapsule {
	private String name;
	private int score;
	//コンストラクタ
	public StudentCapsule(String name, int score) {
		this.name = name;
		this.score = score;
	}
		
	public static StudentCapsule[] createStudents() {
		
		StudentCapsule[] students = new StudentCapsule[3];
		students[0] = new StudentCapsule("桐生", 85);
		students[1] = new StudentCapsule("万丈", 35);
		students[2] = new StudentCapsule("猿渡", 65);
		
	return students;
	}
		
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void showInfo() {
		System.out.println("名前:" + name);
		System.out.println("	点数:" + score);
	}
	
	
}
