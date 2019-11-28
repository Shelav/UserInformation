package com.DAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import com.model.UserDetails;
import org.springframework.stereotype.Repository;
 

public interface UserDetailsAccountBalanceDAO {
 
    public UserDetails[] getAllUserDetails();
 
}