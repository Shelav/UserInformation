package com.Controller;
import java.util.List;
import com.Service.UserService;
import com.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class UserAccountBalanceController {
 
    @Autowired
    private UserAccountBalanceService userAccountBalanceService;
 
    //@RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to UserDetailsAccountBalance.";
    }
 
    @RequestMapping(value = "/users",method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
    public String getAllUserDetails(Model model) {
        model.addAttribute("users", userAccountBalanceService.getAllUsersDetails())
        return users;
    }
}