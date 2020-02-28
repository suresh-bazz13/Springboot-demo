package com.example.Crud.demo.CrudCtrler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Crud.demo.CrudServc.CrudService;
import com.example.Crud.demo.crudCustomer.CrudCustomer;

@Controller
@RequestMapping("/customer")
public class CrudController {

@Autowired
CrudService crudSer;


@PostMapping
public @ResponseBody boolean saveCustomer(@RequestBody CrudCustomer cus) {
	
	try {
		return crudSer.saveCus(cus);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return false;
	}
}
@GetMapping
public @ResponseBody List<CrudCustomer> fetchCustomer() {
	
	try {
		return crudSer.showCus();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}
@GetMapping("{id}")
public @ResponseBody Optional<CrudCustomer> display (@PathVariable Long id){
	
	return crudSer.findId(id);
	
}

@GetMapping("/user/{name}")
public @ResponseBody CrudCustomer display (@PathVariable String name){
	
	try {
		return crudSer.findName(name);	
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}
	
@GetMapping ("getAll")
public @ResponseBody List<CrudCustomer> findAll () {
	try{
		return crudSer.findPPl();
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
}
@DeleteMapping("/delete/{id}")
public @ResponseBody boolean DeleteRecord (@PathVariable("id") Long id) {
	try{
		return crudSer.deleteId(id);
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}

@PostMapping ("/edit/{name}/{name2}")
public @ResponseBody boolean UpdateRecord (@PathVariable("name") String name, @PathVariable("name2") String name2) {
	try {
		crudSer.updateName(name, name2);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
		return false;
	}
}


}
