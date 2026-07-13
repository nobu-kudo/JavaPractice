package basic;

public class StudentArraySample {

	public static void main(String[] args) {
	
		StudentCapsule[] students = StudentCapsule.createStudents(); 
		int sum = 0;
		double average;
		StudentCapsule topStudent = students[0];
		StudentCapsule bottomStudent = students[0];
		
		System.out.println("合格者");
		for(int i = 0; i < students.length; i++ ) {
			if(students[i].getScore() >= 80) {
				students[i].showInfo();
			}
			sum += students[i].getScore();
			if(students[i].getScore() > topStudent.getScore()) {
				topStudent = students[i];
			}
			if(students[i].getScore() < bottomStudent.getScore()) {
				bottomStudent = students[i];
			}
		}
		average = (double) sum / students.length;
		System.out.println("合計点:" + sum);
		System.out.printf("平均点:%.2f%n", average);
		System.out.println("最高得点者");
		topStudent.showInfo();
		System.out.println("最低得点者");
		bottomStudent.showInfo();
	}

}
