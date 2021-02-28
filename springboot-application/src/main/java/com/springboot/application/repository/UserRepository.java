package com.springboot.application.repository;
import com.springboot.application.model.*;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, String> {    

}    
