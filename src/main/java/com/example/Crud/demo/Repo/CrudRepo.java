package com.example.Crud.demo.Repo;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Crud.demo.crudCustomer.CrudCustomer;


@Repository
public interface CrudRepo extends JpaRepository <CrudCustomer,Long> {
	
	@Query("select c from CrudCustomer c where c.name =:user")
	CrudCustomer Suresh(String user);
	
	
	@Transactional
	@Modifying
	@Query("update CrudCustomer c set c.name =:name2 where c.name =:name")
	void editName(String name, String name2);
}
 