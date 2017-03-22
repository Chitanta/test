package com.sg;

public class Student {
	private Long id;
	private String aclass;//班级
	private String name;
	private Double grade;
	private String major;

	public Student(){
	
	}

	public Student(Long id, String aclass, String name, Double grade,
			String major) {
		super();
		this.id = id;
		this.aclass = aclass;
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAclass() {
		return aclass;
	}

	public void setAclass(String aclass) {
		this.aclass = aclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", aclass=" + aclass + ", name=" + name
				+ ", grade=" + grade + ", major=" + major + "]";
	}
    
}