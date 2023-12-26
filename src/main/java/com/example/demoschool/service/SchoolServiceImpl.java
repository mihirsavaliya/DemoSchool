package com.example.demoschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoschool.model.School;
import com.example.demoschool.repository.SchoolRepo;

@Service
public class SchoolServiceImpl implements SchoolService
{

	@Autowired
	SchoolRepo schoolrepo;
	
	@Override
	public List<School> getAllData() {
		// TODO Auto-generated method stub
		return schoolrepo.findAll();
	}

	@Override
	public School save(School school) {
		// TODO Auto-generated method stub
		return schoolrepo.save(school);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		schoolrepo.deleteById(id);
	}

	@Override
	public School edit(School school) {
		// TODO Auto-generated method stub
		School sc = schoolrepo.findById(school.getId()).orElse(null);
		if(sc != null)
		{
			sc.setId(school.getId());
			sc.setName(school.getName());
			sc.setFees(school.getFees());
			schoolrepo.save(sc);
			return sc;
		}
		return save(school);
	}

}
