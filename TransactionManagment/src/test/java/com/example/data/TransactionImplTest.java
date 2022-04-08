package com.example.data;

import Entity.TransactionEntity;
import Repository.TransactionRepository;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class TransactionImplTest {
    @Test
    public void testAddGet() {
        TransactionRepository transactionRepository = new TransactionRepository() {
            @Override
            public Long addTransaction(String accountId, int amount) {
                return null;
            }

            @Override
            public Optional<List<TransactionEntity>> getTransactions(String accountId) {
                return Optional.empty();
            }

            @Override
            public <S extends TransactionEntity> S save(S entity) {
                return null;
            }

            @Override
            public <S extends TransactionEntity> Iterable<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<TransactionEntity> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public Iterable<TransactionEntity> findAll() {
                return null;
            }

            @Override
            public Iterable<TransactionEntity> findAllById(Iterable<Long> longs) {
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
            public void delete(TransactionEntity entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends TransactionEntity> entities) {

            }

            @Override
            public void deleteAll() {

            }
        };
        String transaction1 = String.valueOf(transactionRepository.addTransaction("Account1", 150));
        String transaction2 = String.valueOf(transactionRepository.addTransaction("Account2", 70));
        String transaction3= String.valueOf(transactionRepository.addTransaction("Account1", 80));

        Optional<List<TransactionEntity>> result = transactionRepository.getTransactions("Account1");

        assertEquals(2, result.get().size());
        assertEquals(150, result.get().get(0).getAmount());
        assertEquals(transaction2, result.get().get(1).getId());
        assertEquals(80, result.get().get(1).getAmount());

        assertEquals(Optional.empty(), transactionRepository.getTransactions("XXX"));
    }
}