package basic;

public class StudentCapsule {
	private String name;
	private int score;
	//コンストラクタ
	public StudentCapsule(String name, int score) {
		if(score < 0 || score > 100) {
		throw new IllegalArgumentException("点数は0～100で入力してください");
		}
		this.name = name;
		this.score = score;
	}
		
	public static StudentCapsule[] createStudents() {
	
		StudentCapsule[] students = new StudentCapsule[3];
		students[0] = new StudentCapsule("桐生", 95);
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
		System.out.printf("名前:%s 点数:%d 評価%s%n", name, score, getGrade());
	}
	public String getGrade() {
		
		if(score >= 90) {
			return "A";
		}else if(score >= 80) {
			return "B";
		}else if(score >= 70) {
			return "C";
		}else if(score >= 60) {
			return "D";
		}else {
			return "F";
		}
	}
	
	
}
