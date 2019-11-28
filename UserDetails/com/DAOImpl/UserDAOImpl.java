package com.DAOImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.Repository.UserRepository;
import com.model.UserDetails;
import org.springframework.stereotype.Repository;
import com.DAO.UserDAO;
 
@Repository
public class UserDAOImpl implements UserDAO{
 
    @Autowired
    private UserRepository userRepository;

     
    public Optional<UserDetails> getUser(int id) {
        return userRepository.findOne(id);
    }
 
    public void addUser(UserDetails userDetails) {
        userRepository.save(userDetails);
    }
 
    public void updateUser(UserDetails userDetails) {
        userRepository.update(userDetails);
    }
 
    public void deleteUser(int id) {
        userRepository.delete(id);  
    }
 
    public List<UserDetails> getAllUserDetails() {
	List<UserDetails> userDetailsList = new ArrayList<>();  
        userRepository.findAll().forEach(userDetailsList::add);      
        return userDetailsList;
    }
 
}