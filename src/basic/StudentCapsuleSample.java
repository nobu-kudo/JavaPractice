package basic;

public class StudentCapsuleSample {

	public static void main(String[] args) {
		
		StudentCapsule s1 = new StudentCapsule("桐生", 85);
		
		System.out.println(s1.getName());
		System.out.println(s1.getScore());
		
		s1.setScore(95);
		
		System.out.println("更新後");
		System.out.println(s1.getScore());
	}

}
