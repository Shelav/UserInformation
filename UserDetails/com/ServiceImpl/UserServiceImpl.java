package com.ServiceImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.service.UserService;
import com.DAO.UserDAO; 
import com.model.UserDetails;
import org.springframework.stereotype.Repository;
import com.Service.UserService;
 
@Repository
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDAO userDAO;

     
    public Optional<UserDetails> getUser(int id) {
        return userDAO.getUserDetail(id);
    }
 
    public void addUser(UserDetails userDetails) {
        userDAO.addUser(user);
    }
 
    public void updateUser(UserDetails userDetails) {
        usereDAO.updateUser(userDetail);
    }
 
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
 
    public List<UserDetails> getAllUserDetails() {
	List<UserDetails> userDetailsList = userDAO.getAllUserDetails();
        return userDetailslist;
    }
 
}