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
 
@Repository
public class UserDetailsAccountBalanceServiceImpl implements UserDetailsAccountBalanceService {
 
    @Autowired
    private UserDetailsAccontBalanceDAO userDetailsAccountBalanceDAO;

    public UserDetails[] getAllUserDetails() {
		UserDetails[] userDetails = userDetailsAccountBalanceDAO.getAllUserDetails();
        return userDetails;
    }
 
}