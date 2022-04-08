package Controller;

import Entity.AccountType;
import Service.WithdrawalMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WithdrawDto {


    private int userid;

    private String number;


    private String fullName;


    public WithdrawalMethod getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    private String cardNumber;


    private Integer amount;


    private AccountType type;
}
