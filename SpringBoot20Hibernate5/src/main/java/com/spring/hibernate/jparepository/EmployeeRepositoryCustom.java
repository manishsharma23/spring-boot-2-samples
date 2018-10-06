package com.spring.hibernate.jparepository;

import java.util.List;
import org.springframework.data.repository.query.Param;
/**
 * Created by gkatzioura on 6/3/16.
 */
public interface EmployeeRepositoryCustom {
    List<Employee> getFirstNamesLike(String firstName);
    
	 Employee findOneRecord_ById(@Param("id") long id);
}