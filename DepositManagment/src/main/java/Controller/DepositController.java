package Controller;

import Entity.BankAccountEntity;

import Service.Deposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class DepositController {

    @Autowired
    Deposit deposit;




    @GetMapping("/bankAccount/{userid}")
    private BankAccountEntity listCreateBankAccount(@PathVariable String userid) {
        return (BankAccountEntity) deposit.listCreateBankAccount();
    }


    @GetMapping("/deposit/{userid}")
    private BankAccountEntity getAllDeposit(@PathVariable("userid") int id) {
        return (BankAccountEntity) deposit.getAllDeposit(id);
    }
    @GetMapping("/findUserAccount/{userid}")
    private BankAccountEntity findUserAccount(@PathVariable("userid") int id ) {
        return (BankAccountEntity) deposit.getAllDeposit(id);
    }

    @GetMapping("/findUserAccount/{userid}")
    private BankAccountEntity changeStatusDeposit(@PathVariable("userid") int id ) {
        return (BankAccountEntity) deposit.getAllDeposit(id);
    }
    @PostMapping("/withdraw")
    @ResponseBody
    public Long withdraw(@RequestBody WithdrawDto withdraw) {
        return deposit.withdraw(withdraw.getCardNumber(), withdraw.getAmount());
    }

    @PostMapping("/deposit")
    @ResponseBody
    public DepositDto deposit(@RequestBody DepositDto deposit) {
        return deposit;
    }
}
