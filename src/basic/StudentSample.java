package basic;

public class StudentSample {

	public static void main(String[] args) {
		
		Student s1 = new Student("桐生", 85);
		Student s2 = new Student("万丈", 30);
		Student s3 = new Student("猿渡", 65);
		
		
		System.out.println("名前" + s1.name);
		System.out.println("点数" + s1.score);

		System.out.println("名前" + s2.name);
		System.out.println("点数" + s2.score);
		
		System.out.println("名前" + s3.name);
		System.out.println("点数" + s3.score);
	}

}
