package com.crowsroom.hibernate.dao;

import java.util.List;

import com.crowsroom.hibernate.model.Teacher;

public class TeacherDaoImpl extends CrowSession implements TeacherDao{
	
	private CrowSession crowsession;

	public TeacherDaoImpl() {
		
		crowsession=new CrowSession();
		
	}

	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		crowsession.getSession().persist(teacher);
		crowsession.getSession().getTransaction().commit();
		//crowsession.getSession().close();
		
	}

	public List<Teacher> findallTeachers() {
		// TODO Auto-generated method stub
		return crowsession.getSession().createQuery("from Teacher").list();
	}

	public void deleteTeacher(Long idTeacher) {
		// TODO Auto-generated method stub
		Teacher teacher1 = findTeacherbyId(idTeacher);
		crowsession.getSession().delete(teacher1);
		crowsession.getSession().getTransaction().commit();
		//crowsession.getSession().close();
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		crowsession.getSession().update(teacher);
		crowsession.getSession().getTransaction().commit();
		//crowsession.getSession().close();
		
	}

	public Teacher findTeacherbyId(Long idTeacher) {
		// TODO Auto-generated method stub
		//return (Teacher) crowsession.getSession().createQuery("from Teacher where idTeacher = "+idTeacher).getSingleResult();
		return crowsession.getSession().load(Teacher.class, idTeacher);
	}

	public Teacher findTeachersbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void ListTeacher(){
		
		 List<Teacher> teachers=findallTeachers();
	        
	        for (Teacher t : teachers) {
	        	
	        	System.out.println("Nombre :" +t.getName());
				
			}
		
	}

}
