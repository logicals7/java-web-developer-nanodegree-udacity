package com.udacity.krishan.dogMicroservice.repository;

import com.udacity.krishan.dogMicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {
}
