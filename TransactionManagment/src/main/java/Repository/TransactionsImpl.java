package Repository;

import Entity.TransactionEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
@Scope("singleton")
public final class TransactionsImpl implements TransactionRepository {
    private final Map<String, List<TransactionEntity>> data = new HashMap<>();

    @Override
    public synchronized Long addTransaction(String accountId, int amount) {
        TransactionEntity transaction = new TransactionEntity(accountId, amount);
        if (!data.containsKey(accountId)) {
            data.put(accountId, new ArrayList<>());
            data.get(accountId).add(transaction);
        } else {
            data.get(accountId).add(transaction);
        }

        return transaction.getId();
    }

    @Override
    public synchronized Optional<List<TransactionEntity>> getTransactions(String accountId) {
        if (!data.containsKey(accountId)) {
            return Optional.empty();
        }

        return Optional.of(new ArrayList<>(data.get(accountId)));
    }



    @Override
    public synchronized Optional<List<TransactionEntity>> ViewTransactions(String accountId, int IssueTracking) {
        if (!data.containsKey(IssueTracking)) {
            return Optional.empty();
        }

        return Optional.of(new ArrayList<>(data.get(IssueTracking)));
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
}