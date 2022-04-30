 package com.example.depositmanagment.data;

import Entity.BankAccountEntity;
import Entity.UserEntity;
import Repository.BankAccountRepository;
import Service.WithdrawalMethod;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DepositImpllTest {
    @Test
    public void testAddGetDelete() {
        BankAccountRepository bankAccountRepository = new BankAccountRepository() {
            @Override
            public UserEntity findUserAccount(WithdrawalMethod withdrawalMethod, int id) {
                return null;
            }

            @Override
            public BankAccountEntity changeStatusDeposit(WithdrawalMethod withdrawalMethod) {
                return null;
            }

            @Override
            public BankAccountEntity find(WithdrawalMethod withdrawalMethod) {
                return null;
            }

            @Override
            public Optional<BankAccountEntity> getAllDeposit(Long id) {
                return Optional.empty();
            }

            @Override
            public Optional<BankAccountEntity> listCreateBankAccount() {
                return Optional.empty();
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
            public List<BankAccountEntity> findAllById(Iterable<Long> longs) {
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
            public <S extends BankAccountEntity> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends BankAccountEntity> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<BankAccountEntity> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends BankAccountEntity> S save(S entity) {
                return null;
            }

            @Override
            public Optional<BankAccountEntity> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
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
            public <S extends BankAccountEntity> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
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
        };

        String deposit1 = bankAccountRepository.findUserAccount("active", "1");
        String deposit2 = bankAccountRepository.findUserAccount( "block", "2");
        String deposit3 = bankAccountRepository.findUserAccount("active", "3");

        Optional<List<BankAccountEntity>> result = bankAccountRepository.findUserAccount("active");

        assertEquals("active", result.get().size());
        assertEquals("block", result.get().get(0).getNumber());
        assertEquals("active", result.get().get(1).getNumber());

        bankAccountRepository.deleteDeposit("active", 3);

        result = bankAccountRepository.getAllDeposit("");

        assertEquals(1, result.get().size());
        assertEquals("Name12", result.get().get(0).getNumber());

        assertEquals(Optional.empty(), bankAccountRepository.getAllDeposit(Long.valueOf("XXX")));

    }
}