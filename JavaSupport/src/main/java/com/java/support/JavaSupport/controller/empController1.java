package com.java.support.JavaSupport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.support.JavaSupport.Model.EmploeeModelResponse;
import com.java.support.JavaSupport.ServiceImpl.empService2;


@RestController
@RequestMapping(value = "/get")
public class empController1 {

	@Autowired(required = true)
	empService2 employee;

	@GetMapping(value = "/details")
	public ResponseEntity<List<EmploeeModelResponse>> getEmpDetails() {
		List<EmploeeModelResponse> resp = employee.getEmpDetails();
		return new ResponseEntity<List<EmploeeModelResponse>>(resp, HttpStatus.OK);

	}

}