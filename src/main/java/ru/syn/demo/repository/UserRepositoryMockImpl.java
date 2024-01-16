package ru.syn.demo.repository;

public class UserRepositoryMockImpl extends UserRepository {
    @Override
    public String getUserLogin() {
        return "I'm a user";
    }
}
