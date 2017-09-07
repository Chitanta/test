package com.briup.ch12.exercise2;

public class Student implements Comparable<Student> {
	 private Integer id;
	 private String name;
	 private Double score;
	 public Student(Integer id,String name,Double score){
		this.id=id;
		this.name=name;
		this.score=score;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.name.equals("Tom")){
			return -1;
		}
		if(o.name.equals("Tom")){
			return 111;
		}
		if(this.score.equals(o.getScore())){
			return this.id-o.getId();
		}else{
			return (int)(o.getScore()-this.score);
		}
	}
}
