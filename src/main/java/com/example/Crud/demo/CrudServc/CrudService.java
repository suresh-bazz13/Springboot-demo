package com.example.Crud.demo.CrudServc;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.demo.Repo.CrudRepo;
import com.example.Crud.demo.crudCustomer.CrudCustomer;

@Service
public class CrudService {
	
	
	@Autowired
	CrudRepo repo;
	
	public boolean saveCus(CrudCustomer cus) {
		try {
			repo.save(cus);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}
	
	public List<CrudCustomer> showCus() {
		try {
			return repo.findAll();
			
		} catch(Exception e) {
			e.printStackTrace();
		return null;
		}
	}
	
	public void getService()
	{
		System.out.println("Service Get");
	}	
	public void postService()
	{
		System.out.println("Service Post");
	}

	public Optional<CrudCustomer> findId(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	
	public CrudCustomer findName(String name) {
		// TODO Auto-generated method stub
		return repo.Suresh(name);
	}

	public List<CrudCustomer> findPPl() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public boolean deleteId(Long id) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateName(String name, String name2) {
		// TODO Auto-generated method stub
		try {
			repo.editName(name, name2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return true;
		}
		
	}
}
