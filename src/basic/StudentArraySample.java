package basic;

public class StudentArraySample {

	public static void main(String[] args) {
	
		StudentCapsule[] students = StudentCapsule.createStudents(); 
		int sum = 0;
		double average;
		
		for(int i = 0; i < students.length; i++ ) {
			if(students[i].getScore() >= 80) {
				students[i].showInfo();
			}
			sum += students[i].getScore();
		}
		average = (double) sum / students.length;
		System.out.println("合計点:" + sum);
		System.out.printf("平均点:%.2f%n", average);
	}

}
