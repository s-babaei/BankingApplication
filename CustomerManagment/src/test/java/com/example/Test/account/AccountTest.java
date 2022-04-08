package com.example.Test.account;

import Entity.UserEntity;
import Repository.UserRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testAddGetDelete() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        String account1 = String.valueOf(userRepository.addAccount("User1", "Name1"));
        String account2 = String.valueOf(userRepository.addAccount("User2", "Name2"));
        String account3 = String.valueOf(userRepository.addAccount("User3", "Name3"));

        Optional<List<UserEntity>> result =userRepository.getAccounts("User1");

        assertEquals(2, result.get().size());
        assertEquals("Name1", result.get().get(0).getName());
        assertEquals("Name2", result.get().get(1).getName());


        userRepository.deleteAccount("User1", account1);

        result = userRepository.getAccounts("User1");

        assertEquals(1, result.get().size());
        assertEquals("Name2", result.get().get(0).getName());

        assertEquals(Optional.empty(), userRepository.getAccounts("XXX"));

    }

}
