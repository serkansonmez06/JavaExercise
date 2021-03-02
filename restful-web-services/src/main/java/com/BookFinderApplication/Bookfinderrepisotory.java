package com.BookFinderApplication;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Bookfinderrepisotory extends JpaRepository<Todo, Long> {
	List<Todo>findByUsername(String username);

}
