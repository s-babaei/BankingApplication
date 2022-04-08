package Controller;

import Entity.AccountType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DepositDto {

    private int userid;

    private String number;


    private String fullName;


    private String cardNumber;


    private Integer amount;


    private AccountType type;
}
