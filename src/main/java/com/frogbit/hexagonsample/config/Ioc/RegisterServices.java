package com.frogbit.hexagonsample.config.Ioc;

import com.frogbit.hexagonsample.domain.doorIn.IPersonService;
import com.frogbit.hexagonsample.domain.doorOut.IPersonRepositoryDoor;
import com.frogbit.hexagonsample.domain.services.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterServices {

    @Bean
    public IPersonService personService(IPersonRepositoryDoor personRepository){
        return new PersonServiceImpl(personRepository);
    }
}
