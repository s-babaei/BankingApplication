package Repository;

import Entity.BankAccountEntity;
import Entity.UserEntity;
import Service.WithdrawalMethod;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class BankRepositoryImpl implements BankAccountRepository {


    @Override
    public UserEntity findUserAccount(WithdrawalMethod withdrawalMethod,int id) {
        UserEntity userEntity=new UserEntity();
        return userEntity;
    }

    @Override
    public BankAccountEntity changeStatusDeposit(WithdrawalMethod withdrawalMethod) {
       BankAccountEntity bankAccountEntity=new BankAccountEntity();
       return bankAccountEntity;
    }

    @Override
    public BankAccountEntity find(WithdrawalMethod withdrawalMethod) {
        return null;
    }

    @Override
    public Optional<BankAccountEntity> getAllDeposit(Long id) {
        BankAccountEntity bankAccountEntity=new BankAccountEntity();
        return Optional.of((bankAccountEntity));
    }

    @Override
    public Optional<BankAccountEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Optional<BankAccountEntity> listCreateBankAccount() {
        BankAccountEntity bankAccountEntity=new BankAccountEntity();
        return Optional.of((bankAccountEntity));
    }

    @Override
    public List<Object> findById(WithdrawalMethod withdrawalMethod) {
        return null;
    }

    @Override
    public List<BankAccountEntity> findAll() {
        return null;
    }

    @Override
    public List<BankAccountEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BankAccountEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<BankAccountEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(BankAccountEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends BankAccountEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends BankAccountEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BankAccountEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends BankAccountEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends BankAccountEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<BankAccountEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BankAccountEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public BankAccountEntity getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends BankAccountEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BankAccountEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BankAccountEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BankAccountEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BankAccountEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BankAccountEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends BankAccountEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
