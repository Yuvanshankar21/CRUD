package com.yuvan.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuvan.crud.model.DataModel;
import com.yuvan.crud.repository.DataRepo;

@Controller
public class DataController {
	
	@Autowired
	DataRepo dataRepo;
	
	@RequestMapping("/insertval/{name}/{pass}")
	@ResponseBody
	public String insert(@PathVariable(value = "name") String name ,@PathVariable(value = "pass") String pass) {
		DataModel dataModel = new DataModel(); 
		dataModel.setName(name);
		dataModel.setPass(pass);
		dataRepo.save(dataModel);
		return "value insterted";
	}
	
	@RequestMapping("/findval")
	public @ResponseBody List<DataModel> find(){
		return dataRepo.findAll();
	}
	

	

}
