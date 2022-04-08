package Service;



import Entity.UserEntity;
import org.omg.CORBA.UserException;

import java.util.Date;
import java.util.List;

public interface UserService {

  String addUser(String customerId, String name, int initialCredit) throws UserException;

    String addUser(String customerId, String firstName, Integer nationalCode) throws UserExeption;

    //List<UserEntity> getUsers(int userid);

    List<UserEntity> getUsers(String customerId);

    Object findByLastname(String lastname);

    Object findByCreateDate(Date createDate);

    Object findByUserCustomer(Integer userCustomer);

    Object findByLastnameAndFirstnameAllIgnoreCase(String firstname);

  Object findByLastnameAndFirstnameAllIgnoreCase(String firstname, String lastname);

  UserEntity addUser(String firstName);


    // List<Account> getAccounts(String customerId);
}