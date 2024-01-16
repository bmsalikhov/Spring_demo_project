package ru.syn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.syn.demo.repository.UserRepository;

@Component
public class UserService {

    @Autowired
    @Qualifier("mock")
    UserRepository mockRepository;

    @Autowired
    @Qualifier("real")
    UserRepository realRepository;

    public boolean isAuth(String newUser) {
        var mockUser = mockRepository.getUserLogin();
        var realUser = realRepository.getUserLogin();
        System.out.println("mock: " + mockUser);
        System.out.println("real: " + realUser);
        return true;
    }
}
