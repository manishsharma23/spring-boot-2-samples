package com.spring.crudrepository;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface SystemRepository_CrudRepository_s2h5 extends CrudRepository<System_s2h5, Long> {
	/*
	 * @Override default <S extends System_s2h5> S save(S entity) { // TODO
	 * Auto-generated method stub entity.setId(entity.getId());
	 * entity.setName(entity.getName());
	 * entity.setLastaudit(entity.getLastaudit()); return null; }
	 */
	@Query("SELECT a FROM System_s2h5 a WHERE a.id=:id")
	System_s2h5 findOneRecord_ById(@Param("id") long id);
	@Query("SELECT a FROM System_s2h5 a WHERE a.id=:id")
	List<System_s2h5> findById(@Param("id") long id);
	@Query("SELECT a FROM System_s2h5 a WHERE a.name=:name")
	List<System_s2h5> findByName(@Param("name") String name);
	// List<System_s2h5> findByIdAndName(Integer id, String name);
	@Query("SELECT a FROM System_s2h5 a WHERE a.id=:id and a.name=:name")
	List<System_s2h5> findByIdAndName(@Param("id") long id, @Param("name") String name);
	@Query("SELECT a FROM System_s2h5 a WHERE a.lastaudit=:lastaudit")
	List<System_s2h5> findBylastaudit(@Param("lastaudit") Date lastaudit);
}