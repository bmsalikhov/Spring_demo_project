package ru.syn.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.syn.demo.repository.UserRepository;
import ru.syn.demo.repository.UserRepositoryMockImpl;
import ru.syn.demo.repository.UserRepositoryRealImpl;

@Configuration
public class DemoConfig {

    @Bean(name = "mock")
    UserRepository getUserMockRepo() {
        return new UserRepositoryMockImpl();
    }

    @Bean(name = "real")
    UserRepository getUserRealRepo() {
        return new UserRepositoryRealImpl();
    }

}
