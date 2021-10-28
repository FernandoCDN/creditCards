package com.carvajal.crudCreditCards.repositories;


import com.carvajal.crudCreditCards.models.creditCardModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface creditCardRepository extends CrudRepository<creditCardModel, Integer> {



}
