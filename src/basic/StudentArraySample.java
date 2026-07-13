package basic;

public class StudentArraySample {
	//合格者の集計
	public static void printPassedStudents(StudentCapsule[] students){
		System.out.println("合格者");
		for(int i = 0; i < students.length; i++ ) {
			if(students[i].getScore() >= 80) {
				students[i].showInfo();
			}
		}
	}
	//名前検索メソッド
	public static void searchStudent(StudentCapsule[] students, String name) {
		System.out.println("検索結果");
		for(int i = 0; i < students.length; i++ ) {
		if(students[i].getName().equals(name)){
			students[i].getName().equals(name);
		students[i].showInfo();
		}
		}
	}
	//合計点・平均点・最高点・最低点・の集計
	public static void printSummary(StudentCapsule[] students) {
		int sum = 0;
		double average;
		StudentCapsule topStudent = students[0];
		StudentCapsule bottomStudent = students[0];
		for(int i = 0; i < students.length; i++) {
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

	public static void main(String[] args) {
		//学生データの作成
		try {//例外処理
		StudentCapsule[] students = StudentCapsule.createStudents();
				//合格者の表示
		printPassedStudents(students);
		//検索結果の呼び出し
		searchStudent(students, "猿渡");
		//集計の表示
		printSummary(students);
		}catch(IllegalArgumentException e) {
			System.out.println("点数は0～100までの整数を入力してください");
		}

	}

}
