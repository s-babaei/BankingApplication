package Entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@AllArgsConstructor
@Builder
@Table(schema = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "nationalCode", unique = true)
    private Integer nationalCode;
    @Column(name = "userCustomer")
    private Integer userCustomer;
    @Column(name = "phoneNumber")
    private Integer phoneNumber;
    @Column(name = "userState")
    private UserState userState;
    @Column(name = "userType")
    private UserType userType;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "customerId")
    private String customerId;




    @OneToOne
    private BankAccountEntity bankAccountEntity;

    public UserEntity() {

    }

    public UserEntity(String customerId, String firstName, String nationalCode) {
    }

    public UserEntity(String identificationNumber) {
    }


//
//    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<BankAccountEntity> accounts;
//



    public Object getNationalCode(Integer nationalCode) {
        return nationalCode;
    }
    public UserEntity(String customerId, String name) {

        this.customerId = customerId;
        this.firstName = name;

    }

    public int getUserid() {
        return getUserid();
    }

    public String getName() {
        return getName();
    }
}