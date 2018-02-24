package com.crowsroom.hibernate.dao;

import java.util.List;

import com.crowsroom.hibernate.model.Teacher;

public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher> findallTeachers();
	
	void deleteTeacher(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findTeacherbyId(Long idTeacher);
	
	Teacher findTeachersbyName(String name);

}
