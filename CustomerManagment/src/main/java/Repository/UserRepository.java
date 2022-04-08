package Repository;

import Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    Optional<UserEntity> findByIdentificationNumber(String identificationNumber);
    List<UserEntity> findByLastname(String lastname);
    List<UserEntity> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);
    List<UserEntity> findByCreateDate(Date createDate);
    List<UserEntity> findByUserCustomer(Integer userCustomer);

   // long addUser(String customerId,String name,Integer nationalCode);

  //  long addUser(String customerId, String firstName, String nationalCode);

   // List<UserEntity> getUser(Integer userCustomer);

    long addUser(String customerId, String name, Integer nationalCode);

    long addUser(String customerId, String firstName, String nationalCode);

    void deleteAccount(String customerId, String accountId);
    Optional<List<UserEntity>> getUsers(String customerId);
}

