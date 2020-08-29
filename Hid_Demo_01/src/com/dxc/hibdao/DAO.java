package com.dxc.hibdao;

import java.util.List;

import com.dxc.beans.Student;

public interface DAO {

	List<Student> findAll();
	Student find(int id);
	Student insert(Student student);
	Student update(Student student);
	boolean delete(int id);
}
