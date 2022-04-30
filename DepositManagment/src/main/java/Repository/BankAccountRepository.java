package Repository;

import Entity.BankAccountEntity;
import Entity.UserEntity;
import Service.WithdrawalMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {



    BankAccountEntity findByAccountNumber(int accountNumber);

    UserEntity findUserAccount(WithdrawalMethod withdrawalMethod, int id);

    BankAccountEntity changeStatusDeposit(WithdrawalMethod withdrawalMethod);

    BankAccountEntity find(WithdrawalMethod withdrawalMethod);

    Optional<BankAccountEntity> getAllDeposit(Long id);

    Optional<BankAccountEntity> listCreateBankAccount();

    List<Object> findById(WithdrawalMethod withdrawalMethod);

    String findUserAccount(String active, String s);

    Optional<List<BankAccountEntity>> findUserAccount(String active);
}
