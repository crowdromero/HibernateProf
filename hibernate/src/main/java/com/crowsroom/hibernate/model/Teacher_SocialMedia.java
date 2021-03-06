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
@Table(name="teacher_social_media")
public class Teacher_SocialMedia implements Serializable{
	
	@Id
	@Column(name="id_teacher_social_media")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTeacherSocialMedia;
	
	@Column(name="nickname")
	private String nickname;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_teacher")
	private Teacher teacher;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_social_media")
	private SocialMedia socialmedia;
		
	
	public Long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}
	public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public SocialMedia getSocialmedia() {
		return socialmedia;
	}
	public void setSocialmedia(SocialMedia socialmedia) {
		this.socialmedia = socialmedia;
	}
	public Teacher_SocialMedia() {
		super();
		
	}
	public Teacher_SocialMedia(Teacher teacher, SocialMedia socialmedia,String nickname) {
		super();
		this.teacher = teacher;
		this.socialmedia = socialmedia;
		this.nickname=nickname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	

}
