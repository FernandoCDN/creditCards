package com.carvajal.crudCreditCards.services;

import com.carvajal.crudCreditCards.models.clientModel;
import com.carvajal.crudCreditCards.repositories.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class clientService {

    @Autowired
    clientRepository clientRepository;

    public List<clientModel> getAllClients() {
        return (List<clientModel>) clientRepository.findAll();
    }

    public clientModel saveClient(clientModel client){
        return clientRepository.save(client);
    }

    public boolean deleteClient(Integer id) {

        try
        {
            clientRepository.deleteById(id);
            return true;
        }
        catch(Exception err)
        {
            return false;
        }

    }

}
