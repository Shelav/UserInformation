package com.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import com.model.UserDetails;
import org.springframework.stereotype.Repository;
 

public interface UserService {
 
    public Optional<UserDetails> getUser(int id);
    public void addUser(UserDetails userDetails);
    public void updateUser(UserDetails userDetails);
    public void deleteUser(int id);
    public List<UserDetails> getAllUserDetails();
 
}