package Service;


import Entity.TransactionEntity;
import Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Long addTransaction(String accountId, int amount) {
        return transactionRepository.addTransaction(accountId, amount);
    }

    @Override
    public List<TransactionEntity> getTransactions(String accountId, int limit) {
        Optional<List<TransactionEntity>> transactions = transactionRepository.getTransactions(accountId);
        if (!transactions.isPresent()) {
            return new ArrayList<>();
        }

        List<TransactionEntity> transactionsList = transactions.get();

        if (limit <= 0) {
            return transactionsList;
        }

        return transactionsList.subList(Math.max(transactionsList.size() - limit, 0), transactionsList.size());
    }
    @Override
    public Optional<List<TransactionEntity>> ViewTransactions(String accountId, int IssueTracking) {
         return transactionRepository.ViewTransactions(accountId, IssueTracking);
    }

}