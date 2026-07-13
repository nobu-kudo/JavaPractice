package basic;

public class StudentArraySample {

	public static void main(String[] args) {
	
		int sum = 0;
		double average;
		StudentCapsule[] students = new StudentCapsule[3];
		students[0] = new StudentCapsule("桐生", 85);
		students[1] = new StudentCapsule("万丈", 35);
		students[2] = new StudentCapsule("猿渡", 65);
		for(int i = 0; i < students.length; i++ ) {
			students[i].showInfo();
			
			sum += students[i].getScore();
		}
		average = (double) sum / students.length;
		System.out.println("合計点:" + sum);
		System.out.printf("平均点:%.2f%n", average);
	}

}
