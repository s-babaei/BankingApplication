package Service;

import Entity.UserEntity;
import Repository.UserRepository;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


//    @Override
//    public String addUser(String customerId, String name, int initialCredit) throws UserException {
//        return null;
//    }

//    @Override
//    public String addUser(String customerId, String name, int initialCredit) throws UserException {
//        return null;
//    }

    @Override
    public String addUser(String customerId, String name, int initialCredit) throws UserException {
        return null;
    }

    @Override
    public String addUser(String customerId, String firstName, Integer nationalCode) throws UserExeption {
        String accountId = String.valueOf(userRepository.addUser(customerId, firstName,nationalCode));



        return accountId;
    }

//    @Override
//    public List<UserEntity> getUsers(int userid) {
//        return null;
//    }


    public List<UserEntity> getUsers(String customerId) {
        return userRepository.getUsers(customerId).orElseGet(ArrayList::new);
   }

    @Override
    public Object findByLastname(String lastname) {
        return (UserEntity) userRepository.findByLastname(lastname);
    }

    @Override
    public Object findByCreateDate(Date createDate) {
        return userRepository.findByCreateDate(createDate);
    }

    @Override
    public Object findByUserCustomer(Integer userCustomer) {
        return userRepository.findByUserCustomer(userCustomer);
    }

    @Override
    public Object findByLastnameAndFirstnameAllIgnoreCase(String firstname) {
        return null;
    }

    @Override
    public Object findByLastnameAndFirstnameAllIgnoreCase(String firstname, String lastname) {

        return userRepository.findByLastnameAndFirstnameAllIgnoreCase(firstname, lastname);
    }

    @Override
    public UserEntity addUser(String firstName) {
        return null;
    }

//    public long addUser(String customerId, String name, int initialCredit) {
//        return userRepository.addUser(customerId,name,initialCredit);
    }
