package com.frogbit.hexagonsample.adapters.infraestructure.JpaRepositories;

import com.frogbit.hexagonsample.adapters.infraestructure.Entities.PersonJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<PersonJpaEntity, Long> {

}
