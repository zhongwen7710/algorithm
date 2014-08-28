package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ScoresSortOfStudents2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = sc.nextInt();
		List<Student> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Student(sc.next(), sc.nextInt()));
		}
		if (flag == 1) {
			Collections.sort(list);
		} else if (flag == 0) {
			Collections.sort(list, Collections.reverseOrder());
		}
		sc.close();
		for (Student stu : list) {
			System.out.println(stu);
		}
	}

}

class Student implements Comparable<Student> {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.score - o.score;
	}

	public String toString() {
		return name + " " + score;
	}
}