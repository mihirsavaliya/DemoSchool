package com.example.demoschool.service;

import java.util.List;

import com.example.demoschool.model.School;

public interface SchoolService 
{
	List<School> getAllData();

	School save(School school);

	void delete(int id);

	public School edit(School school);
}
