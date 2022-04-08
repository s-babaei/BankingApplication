package Controller;

import Entity.UserEntity;
import Service.UserExeption;
import Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@Slf4j
public class UserController {

    UserService userService;


    @RequestMapping(method = RequestMethod.POST)
    public String createUser(@RequestParam("customerId") String customerId,
                             @RequestParam("firstName") String name,
                             @RequestParam("nationalCode") Integer nationalCode) throws UserExeption {
        return userService.addUser(customerId, name, nationalCode);
    }

    @GetMapping("/user/{lastName}")
    private UserEntity findByLastname(@PathVariable("lastName") String lastName) {
        return (UserEntity) userService.findByLastname(lastName);
    }

    @GetMapping("/user/{firstName}")
    private UserEntity findByLastnameAndFirstnameAllIgnoreCase(@PathVariable("firstName") String firstName) {
        return userService.addUser(firstName);
    }



    @GetMapping("/user/{userCustomer}")
    private UserEntity findByUserCustomer(@PathVariable("userCustomer") String userCustomer) {
        return userService.addUser(userCustomer);
    }


//    @PostMapping("/add")
//    @ResponseBody
//    public void add(@RequestBody UserEntity item) {
//
//        userService.save(item);
//    }
//
//    @GetMapping("/user")
//    private List<UserEntity> creatUsers() {
//        return userService.createUser();
//    }


    @GetMapping("/user/{userid}")
    private List<UserEntity> getUsers(@PathVariable("userid") int userid) {
        return userService.getUsers(String.valueOf(userid));
    }


    @GetMapping("/user/{nationalCode}")
    private List<UserEntity> findByIdentificationNumber(@PathVariable("nationalCode") int nationalCode) {

        return userService.getUsers(String.valueOf(nationalCode));
    }



    @GetMapping("/user/{lastName,firstName}")
    private List<UserEntity>  findByLastnameAndFirstnameAllIgnoreCase(@PathVariable("lastName") String lastName,@PathVariable("firstName") String firstName) {

        return userService.getUsers(lastName);
    }
    @GetMapping("/user/{createDate}")
    private List<UserEntity> findByCreateDate(@PathVariable("createDate") Date createDate) {

        return userService.getUsers(String.valueOf(createDate));
    }

    @GetMapping("/user/{userCustomer}")
    private List<UserEntity> findByUserCustomer(@PathVariable("userCustomer") int userCustomer) {

        return userService.getUsers(String.valueOf(userCustomer));
    }


//    @PutMapping("/users")
//    private UserEntity update(@RequestBody UserEntity user) {
//        userService.saveOrUpdate(user);
//        return user;
//    }
//
//
//    @DeleteMapping("/user/{userid}")
//    private void deleteUser(@PathVariable("userid") int userid) {
//        userService.delete(userid);
//    }
//
//    @PostMapping("/users")
//    private int saveUser(@RequestBody UserEntity user) {
//        userService.saveOrUpdate(user);
//        return user.getUserid();
//    }


}