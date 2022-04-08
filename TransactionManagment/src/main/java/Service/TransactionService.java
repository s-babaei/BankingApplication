package Service;


import Entity.TransactionEntity;

import java.util.List;
import java.util.Optional;

public interface TransactionService {

    Long addTransaction(String accountId, int amount);


    List<TransactionEntity> getTransactions(String accountId, int limit);

    Optional<List<TransactionEntity>> ViewTransactions(String accountId, int limit);
}