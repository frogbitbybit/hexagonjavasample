package com.frogbit.hexagonsample.config.Ioc;

import com.frogbit.hexagonsample.adapters.infraestructure.JpaRepositories.PersonJpaRepository;
import com.frogbit.hexagonsample.adapters.infraestructure.Repositories.PersonRepository;
import com.frogbit.hexagonsample.domain.doorOut.IPersonRepositoryDoor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterRepositories {

    @Bean
    public IPersonRepositoryDoor personRepository(PersonJpaRepository jpaRepository) {
        return new PersonRepository(jpaRepository);
    }
}
