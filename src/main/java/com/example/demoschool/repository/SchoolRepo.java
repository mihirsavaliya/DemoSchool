package com.example.demoschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoschool.model.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>{

}
