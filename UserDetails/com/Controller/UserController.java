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
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @RequestMapping("/")
    @ResponseBody
     public String welcome() {
        return "Welcome to UserDetails.";
    }
 
    @RequestMapping(value = "/users",method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
     public List<UserDetails> getAllUserDetails() {
        List<UserDetails> userDetailsList = userService.getAllUserDetails();
        return userDetailslist;
    }
 
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
     public Optional<UserDetails> getUserDetail(@PathVariable("id") int id) {
        return userService.getUserDetail(id);
    }
     
    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE})
     public void addUser(@RequestBody UserDetails user) { 
        System.out.println("Creating user: " + user.getID());
        userService.addUser(user);
    }
 
    @RequestMapping(value = "/users",method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE})
     public void updateUser(@RequestBody UserDetails userDetail) {
         System.out.println("Editing user: " + user.getId());
         userService.updateUser(userDetail);
    }
 
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE,produces = { MediaType.APPLICATION_JSON_VALUE})
     public void deleteUser(@PathVariable("id") int id) {
        System.out.println("Deleting employee: " +id);
        userService.deleteUser(id);
    }
 
}