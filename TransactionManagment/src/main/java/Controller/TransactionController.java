package Controller;


import Entity.TransactionEntity;
import Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;


    @RequestMapping(method = RequestMethod.POST)
    public Long addTransaction(@RequestParam("accountId") String accountId, @RequestParam("amount") Integer amount) {
        return transactionService.addTransaction(accountId, amount);
    }

    @RequestMapping(value = "{accountId}/{limit}", method = RequestMethod.GET)
    public List<TransactionEntity> getTransactions(@PathVariable String accountId, @PathVariable Integer limit) {
        return transactionService.getTransactions(accountId, limit == null ? -1 : limit);
    }


    @RequestMapping(value = "{accountId}/{limit}", method = RequestMethod.GET)
    public List<TransactionEntity> ViewTransactions(@PathVariable String accountId, @PathVariable Integer IssueTracking, @PathVariable String limit) {
        return transactionService.ViewTransactions(accountId, limit == null ? -1 : Integer.parseInt(limit));
    }
}