package com.spring.crudrepository;
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
@EnableJpaRepositories("com.spring.crudrepository")
@EntityScan("com.spring.crudrepository")
public class TestApplication implements CommandLineRunner {
	@Autowired
	DataSource dataSource;
	@Autowired
	SystemRepository_CrudRepository_s2h5 systemRepository_s2h5;
	@Autowired
	SystemRepository_PagingAndSortingRepository_s2h6 systemRepository_pasr_s2h5;
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
	}
	private void updateRow() {
		// TODO Auto-generated method stub
		System_s2h5 updateRow = systemRepository_s2h5.findOneRecord_ById(4);
		updateRow.setName("update 18 here");
		updateRow.setLastaudit((java.sql.Date.valueOf(LocalDate.parse("2018-09-25"))));
		systemRepository_s2h5.save(updateRow);
	}
	private void deleteDate() {
		// TODO Auto-generated method stub
		System_s2h5 system_s2h5_delete = new System_s2h5("Solaris 12",
				(java.sql.Date.valueOf(LocalDate.parse("2017-09-25"))));
		systemRepository_s2h5.deleteById(new Long(5));
	}
	private void saveData() {
		// TODO Auto-generated method stub
		System_s2h5 system_s2h5_save = new System_s2h5("RHEL 7",
				(java.sql.Date.valueOf(LocalDate.parse("2017-09-25"))));
		systemRepository_s2h5.save(system_s2h5_save);
	}
	private void showDataPageSortRepo() {
		// TODO Auto-generated method stub
		Sort sort = new Sort(new Sort.Order(Direction.ASC, "name"));
		Pageable pageable = new PageRequest(0, 4, sort);
		systemRepository_pasr_s2h5.findAll(pageable).forEach(System.out::println);
	}
	public void showData() {
		System.out.println("Our DataSource is = " + dataSource);
		System.out.println("=======================for each===================");
		Iterable<com.spring.crudrepository.System_s2h5> systemlist = systemRepository_s2h5.findAll();
		for (com.spring.crudrepository.System_s2h5 systemmodel : systemlist) {
			System.out.println("Here is a system: " + systemmodel.toString());
		}
		System.out.println("=======================for each with reference ===================");
		systemRepository_s2h5.findAll().forEach(System.out::println);
		System.out.println("=====================fild all =====================");
		systemRepository_s2h5.findAll().forEach(System.out::println);
		System.out.println("=====================id and name=====================");
		systemRepository_s2h5.findByIdAndName(5, "RHEL 7").forEach(System.out::println);
		System.out.println("=====================name=====================");
		systemRepository_s2h5.findByName("RHEL 7").forEach(System.out::println);
		System.out.println("=====================id=====================");
		systemRepository_s2h5.findById(1).forEach(System.out::println);
		System.out.println("=====================Date=====================");
		// java.sql.Date.valueOf( LocalDate.parse("2017-08-11"));
		systemRepository_s2h5.findBylastaudit(java.sql.Date.valueOf(LocalDate.parse("2017-07-21")))
				.forEach(System.out::println);
	}
}