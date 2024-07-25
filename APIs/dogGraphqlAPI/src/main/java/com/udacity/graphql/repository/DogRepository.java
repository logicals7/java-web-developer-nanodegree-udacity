package com.udacity.graphql.repository;

import com.udacity.graphql.entity.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {

    /*
    - This repository is for creating, reading, updating, and deleting Dog objects.

      Depending on how you implemented your `DogRepository` for the REST API,
      you may be able to completely re-use your code here.

      I actually chose to completely remove any queries from within the `DogRepository`,
      as there are already built-in methods for a `CrudRepository`
      that `findAll` and `findById`.

    @Query("Select d.breed from Dog d where d.id=:id")
    String findDogBreedById(Long id);

    @Query("Select d.name from Dog d")
    List<String> findAllDogNames();

    @Query("Select d.breed from Dog d")
    List<String> findAllDogBreeds();

     */


}
