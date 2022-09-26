package com.java.support.JavaSupport.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.java.support.JavaSupport.Model.EmploeeModelResponse;

@Component

public class empService2 {
	private static final Logger logger = LoggerFactory.getLogger(empService2.class);
	

	public List<EmploeeModelResponse> getEmpDetails() {
		logger.info("getEmplyeeDetails entering >>>> ");
		List<EmploeeModelResponse> emppList = getEmployeeModelList();
		return emppList;
		
	}
		
		
		public List<EmploeeModelResponse> getEmployeeModelList() {
			List<EmploeeModelResponse> employeeModels = new ArrayList<>();

			EmploeeModelResponse model = new EmploeeModelResponse();
			model.setEmpId("123");
			model.setFirstName("tarun");
			model.setLastName("naga");
			model.setFatherName("krishna");
			model.setSal("120000");
			model.setAddress("khammam");

			EmploeeModelResponse model11 = new EmploeeModelResponse();
			model11.setEmpId("1234");
			model11.setFirstName("tarun");
			model11.setLastName("naga");
			model11.setFatherName("krishna");
			model11.setSal("120001");
			model11.setAddress("khammam");

			EmploeeModelResponse model1 = new EmploeeModelResponse();
			model1.setEmpId("12345");
			model1.setFirstName("Chinni");
			model1.setLastName("Bukya");
			model1.setFatherName("Veera");
			model1.setSal("500");
			model1.setAddress("khammam Rural");

			EmploeeModelResponse model2 = new EmploeeModelResponse();
			model2.setEmpId("123456");
			model2.setFirstName("Chinni");
			model2.setLastName("Bukya");
			model2.setFatherName("Veera");
			model2.setSal("501");
			model2.setAddress("khammam Rural");

			employeeModels.add(model11);
			employeeModels.add(model1);
			employeeModels.add(model);
			employeeModels.add(model2);
			return employeeModels;

		}
	}


