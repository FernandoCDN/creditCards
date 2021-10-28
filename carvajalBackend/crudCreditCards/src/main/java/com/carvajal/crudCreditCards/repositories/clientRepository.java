package com.carvajal.crudCreditCards.repositories;

import com.carvajal.crudCreditCards.models.clientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends CrudRepository<clientModel, Integer> {


}
