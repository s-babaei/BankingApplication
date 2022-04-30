package Entity;


import lombok.*;
import net.bytebuddy.dynamic.DynamicType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Getter
@Setter
@Data
@Entity
@AllArgsConstructor
@Builder
@Table(schema = "Bank")
public class BankAccountEntity {

//   @OneToMany
//    private ArrayList<TransactionEntity> transactionEntities;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

private int userid;
    @Column(name = "number")
    private String number;


    private int accountNumber;

    @Column(name ="fullName")
    private String fullName;

    @Column(name = "cardNumber")
    private String cardNumber;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "balance")
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AccountType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AccountStatus status;

    @Column(name = "availableBalance")
    private BigDecimal availableBalance;
    @Column(name = "actualBalance")
    private BigDecimal actualBalance;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private UserEntity user;


    public BankAccountEntity() {


    }
}
