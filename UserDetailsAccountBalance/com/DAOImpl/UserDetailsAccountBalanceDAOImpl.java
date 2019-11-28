package com.DAOImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.Repository.UserRepository;
import com.model.UserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import com.DAO.UserDetailsAccountBalanceDAO;

 
@Repository
public class UserDetailsAccountBalanceDAOImpl implements UserDetailsAccountBalanceDAO {
 
    @Autowired
    private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	public String serviceUrl;
    
	public UserDetailsAccountBalanceDAOImpl(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	} 

    public UserDetails[] getAllUserDetails() {
		UserDetails[] userDetails = restTemplate.getForObject(serviceUrl+"/users", UserDetails[].class);
		return userDetails;
    }
	
}