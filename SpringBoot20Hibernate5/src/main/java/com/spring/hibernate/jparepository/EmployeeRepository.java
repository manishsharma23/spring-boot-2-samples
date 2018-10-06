package com.spring.hibernate.jparepository;

import com.spring.crudrepository.System_s2h5;
import com.spring.hibernate.jparepository.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 * Created by gkatzioura on 6/2/16.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	

}