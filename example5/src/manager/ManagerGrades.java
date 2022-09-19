package manager;

import java.util.ArrayList;

public class ManagerGrades {
	private ArrayList<Grade>  gradeList;
	public ManagerGrades() {
		this.gradeList = new ArrayList();
	}
	public void addGrade(Integer grade) {
		Grade gradeInstance = new Grade(grade, grade > 50);
		this.gradeList.add(gradeInstance);
	}
	public Integer getAverage() {
		Integer average = 0;
		for (Grade grade : this.gradeList) {
			average += grade.getGrade();
		}
		return average / this.gradeList.size();
	}
	public void showApproved() {
		for (Grade grade : this.gradeList) {
			if (grade.getIsApproved()) {
				System.out.println("Approved " + grade.getGrade());
			}
		}
	}
	public void showGrades() {
		for (Grade grade : this.gradeList) {
			System.out.println("Grades " + grade.getGrade());
		}
	}
}
