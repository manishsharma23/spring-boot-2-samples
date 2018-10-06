package com.spring.crudrepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SystemRepository_PagingAndSortingRepository_s2h6
		extends
			PagingAndSortingRepository<System_s2h5, Long> {
	Page<System_s2h5> findAll(Pageable pageable);
}