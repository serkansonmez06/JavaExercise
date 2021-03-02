package com.BookFinderApplication;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookFinderRepository extends JpaRepository<BookFinderRecords, Long> {
	List<BookFinderRecords>findByUsername(String username);

}
