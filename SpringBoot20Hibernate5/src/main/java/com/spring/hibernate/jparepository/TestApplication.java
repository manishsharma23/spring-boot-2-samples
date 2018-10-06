package com.spring.hibernate.jparepository;
import java.time.LocalDate;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories("com.spring.hibernate.jparepository")
@EntityScan("com.spring.hibernate.jparepository")
public class TestApplication implements CommandLineRunner {
	@Autowired
	DataSource dataSource;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	EmployeeRepositoryCustom  employeeRepositoryCustom; 
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		showData();
		// showDataPageSortRepo();
		// saveData();
		// deleteDate();
		// updateRow();
		// return employeeRepository.findAll();
	}
	private void updateRow() {
	}
	private void deleteDate() {
	}
	private void saveData() {
	}
	private void showDataPageSortRepo() {
	}
	public void showData() {
		 // employeeRepository.findAll().forEach(rows->System.out.println(rows));
		  
		 // employeeRepository.findById(new Long(1));
		  
		  
		  System.out.println(employeeRepositoryCustom.findOneRecord_ById(1).getFirstName());
		
	}
}