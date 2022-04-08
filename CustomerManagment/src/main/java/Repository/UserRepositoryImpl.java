package Repository;

import Entity.UserEntity;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
@Scope("singleton")
public final class UserRepositoryImpl implements UserRepository {
    private final Map<String, List<UserEntity>> data = new HashMap<>();

    @Autowired
    UserService userService;

    @Override
    public Optional<UserEntity> findByIdentificationNumber(String identificationNumber) {
        UserEntity userEntity = new UserEntity(identificationNumber);
        return Optional.of((userEntity));

    }


    @Override
    public List<UserEntity> findByLastname(String lastname) {
        return (List<UserEntity>) userService.findByLastname(lastname);
    }

    @Override
    public List<UserEntity> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname) {

        return (List<UserEntity>) userService.findByLastnameAndFirstnameAllIgnoreCase(firstname);
    }

    @Override
    public List<UserEntity> findByCreateDate(Date createDate) {

        return (List<UserEntity>) userService.findByCreateDate(createDate);
    }

    @Override
    public List<UserEntity> findByUserCustomer(Integer userCustomer) {

        return (List<UserEntity>) userService.findByUserCustomer(userCustomer);
    }

    @Override
    public long addUser(String customerId, String name, Integer nationalCode) {
        return 0;
    }

    public Integer getUsers(Integer userCustomer) {
        return userCustomer;
    }


    @Override
    public synchronized long addUser(String customerId, String firstName, String nationalCode) {
        UserEntity userEntity = new UserEntity(customerId, firstName, nationalCode);
        if (!data.containsKey(customerId)) {
            data.put(customerId, new ArrayList<>());
            data.get(customerId).add(userEntity);
        } else {
            data.get(customerId).add(userEntity);
        }

        return userEntity.getId();
    }

    @Override
    public synchronized void deleteAccount(String customerId, String accountId) {
        if (data.containsKey(customerId)) {
            data.get(customerId);
        }
    }

//    @Override
//    public Optional<List<UserEntity>> getUsers(String customerId) {
//        return Optional.empty();
//    }

    public synchronized Optional<List<UserEntity>> getUsers(String customerId) {
        if (!data.containsKey(customerId)) {
            return Optional.empty();
        }

        return Optional.of(new ArrayList<>(data.get(customerId)));
    }

    @Override
    public <S extends UserEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<UserEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<UserEntity> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(UserEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}








