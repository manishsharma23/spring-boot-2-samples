package com.spring.hibernate.jparepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by gkatzioura on 6/3/16.
 */
@Repository
@Transactional(readOnly = true)
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<Employee> getFirstNamesLike(String firstName) {
		Query query = entityManager.createNativeQuery(
				"SELECT em.* FROM spring_data_jpa_example.employee as em " + "WHERE em.firstname LIKE ?",
				Employee.class);
		query.setParameter(1, firstName + "%");
		return query.getResultList();
	}
	@Override
	public Employee findOneRecord_ById(long id) {
		Query query = entityManager.createNamedQuery("Select * from employee as em " + "where em.id = ?",
				Employee.class);
		query.setParameter(1, id);
		
		List <Employee> empList = query.getResultList();
		return empList.get(0);
	}
}