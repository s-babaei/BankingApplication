package Entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Data
@AllArgsConstructor
@Builder
@Entity
@Table(schema = "Transaction")
public class TransactionEntity {


    @ManyToOne
    @JoinColumn(name = "bank_account_entity_id")
    BankAccountEntity bankAccountEntity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "transactionType")
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Column(name = "referenceNumber")
    private String referenceNumber;

    @Column(name = "transactionId")
    private String transactionId;

    @Column(name = "type")
    private int type;

    @Column(name = "date")
    private Date date;

    @Column(name = "accountId")
    private String accountId;

    @Column(name = "time")
    private Date time;

    @Column(name = "IssueTracking")
    private int IssueTracking;

    @Column(nullable = false, name = "sourceAccountId")
    private long sourceAccountId;


    @Column(nullable = false, name = "destinationAccountId")
    private long destinationAccountId;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "account_id", referencedColumnName = "id")
//    private BankAccountEntity account;



    protected TransactionEntity() {
    }


    public TransactionEntity(String accountId, int amount) {
        this.type = type;
        this.amount = BigDecimal.valueOf(amount);
        this.date = date;
        this.accountId = accountId;
    }
}
