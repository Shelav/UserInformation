package com.UserRepository;
import org.springframework.data.repository.CrudRepository;  
public interface UserRepository extends CrudRepository<UserDetails, String> {  
}  