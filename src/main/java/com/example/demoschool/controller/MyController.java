package com.example.demoschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demoschool.model.School;
import com.example.demoschool.service.SchoolService;

@Controller
public class MyController 
{
	@Autowired
	SchoolService schoolservice;
	
	@ResponseBody
	@GetMapping("/allData")
	public List<School> allSchools()
	{
		return schoolservice.getAllData();
	}
	
	@ResponseBody
	@PostMapping("/addData")
	public School datadd(@RequestBody School school)
	{
		return schoolservice.save(school);
	}
	
	@ResponseBody
	@DeleteMapping("/delete")
	public void deleteData(@RequestParam("id") int id)
	{
		schoolservice.delete(id);
	}
	
	@ResponseBody
	@PutMapping("/edit")
	public School editschool(@RequestBody School school)
	{
		return schoolservice.edit(school);
	}
}
