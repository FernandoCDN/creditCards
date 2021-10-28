package com.carvajal.crudCreditCards.services;


import com.carvajal.crudCreditCards.models.clientModel;
import com.carvajal.crudCreditCards.models.creditCardModel;
import com.carvajal.crudCreditCards.repositories.creditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class creditCardService {

    @Autowired
    creditCardRepository creditCardRepository;

    public List<creditCardModel> getAllCards() {
        return (List<creditCardModel>) creditCardRepository.findAll();
    }

    public creditCardModel saveCreditCard(creditCardModel card){
        return creditCardRepository.save(card);
    }

    public creditCardModel updatecreditCard(Integer id, creditCardModel creditCardModel) {

        creditCardRepository.deleteById(id);
        creditCardRepository.save(creditCardModel);

        return creditCardRepository.save(creditCardModel);
    }

    public boolean deleteCreditCard(Integer id) {

        try
        {
            creditCardRepository.deleteById(id);
            return true;
        }
        catch(Exception err)
        {
            return false;
        }

    }

}
