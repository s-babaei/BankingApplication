package Repository;

import Entity.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends CrudRepository<TransactionEntity, Long> {

    Long addTransaction(String accountId, int amount);
    Optional<List<TransactionEntity>> getTransactions(String accountId);
    Optional<List<TransactionEntity>> ViewTransactions(String accountId, int IssueTracking);
}
