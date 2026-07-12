package basic;

public class StudentArraySample {

	public static void main(String[] args) {
	
		StudentCapsule[] students = new StudentCapsule[3];
		students[0] = new StudentCapsule("桐生", 85);
		students[1] = new StudentCapsule("万丈", 35);
		students[2] = new StudentCapsule("猿渡", 65);
		for(int i = 0; i < students.length; i++ ) {
			students[i].showInfo();
		}
	}

}
