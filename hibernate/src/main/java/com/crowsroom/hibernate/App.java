package com.crowsroom.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.crowsroom.hibernate.dao.TeacherDaoImpl;
import com.crowsroom.hibernate.model.Course;
import com.crowsroom.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        //Teacher teacher=new Teacher("Onyx Noni", "Avatar");
        TeacherDaoImpl teacherDaoImp=new TeacherDaoImpl();
        //teacherDaoImp.saveTeacher(teacher);
        
        try {
        	

            //Teacher teacher1 = teacherDaoImp.findTeacherbyId((long)9);
            //teacher1.setName("Wani de Pollo");
            //teacher1.setAvatar( "Avatar");
            teacherDaoImp.deleteTeacher((long)9);
			
		} catch (Exception e) {
			System.out.println(e);
		}
        
        
        
        teacherDaoImp.ListTeacher();
        
        
    }
}
