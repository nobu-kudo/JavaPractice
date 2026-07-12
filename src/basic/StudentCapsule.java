package basic;

public class StudentCapsule {
	private String name;
	private int score;
	public StudentCapsule(String name, int score) {
		this.name = name;
		this.score = score;
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
