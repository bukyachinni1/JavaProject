/**
 * 
 */
package com.java.support.JavaSupport.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.java.support.JavaSupport.Model.EmploeeModelResponse;

/**
 * @author TARUN BADDULA
 *
 */
@Component
public class EmployeeImpl {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeImpl.class);

	public List<EmploeeModelResponse> getEmpDetails() {
		logger.info("getEmplyeeDetails entering >>>> ");
		List<EmploeeModelResponse> emppList = getEmployeeModelList();
		List<EmploeeModelResponse> resp = new ArrayList<>();

		for (EmploeeModelResponse emploeeModelResponse : emppList) {

			if (emploeeModelResponse.getSal().trim().equals("120000")
					|| emploeeModelResponse.getSal().trim().equals("501")
					|| emploeeModelResponse.getSal().trim().equals("500")) {
				EmploeeModelResponse modelResponse = new EmploeeModelResponse();
				modelResponse.setEmpId(emploeeModelResponse.getEmpId());
				modelResponse.setFirstName(emploeeModelResponse.getFirstName());
				modelResponse.setLastName(emploeeModelResponse.getLastName());
				modelResponse.setFatherName(emploeeModelResponse.getFatherName());
				modelResponse.setAddress(emploeeModelResponse.getAddress());
				modelResponse.setSal(emploeeModelResponse.getSal());
				resp.add(modelResponse);

			}

		}

		return resp;

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
