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
}