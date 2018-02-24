package com.crowsroom.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course implements Serializable {
	
	@Id
	@Column(name="id_course")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_course;
	
	@Column(name="name")
	private String name;
	
	@Column(name="themes")
	private String themes;
	
	@Column(name="project")
	private String project;
	
	@ManyToOne(optional=true , fetch=FetchType.EAGER)
	@JoinColumn(name="id_teacher")
	private Teacher teacher;
	
	public Long getId_course() {
		return id_course;
	}
	public void setId_course(Long id_course) {
		this.id_course = id_course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, String themes, String project) {
		super();
		this.name = name;
		this.themes = themes;
		this.project = project;
		
	}
	
	
	

}
