package manager;

public class Grade {
	
	private Integer grade;
	private Boolean isApproved;
	public Grade(Integer grade, Boolean isApproved) {
		this.grade = grade;
		this.isApproved = isApproved;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Boolean getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}
	
	
}
