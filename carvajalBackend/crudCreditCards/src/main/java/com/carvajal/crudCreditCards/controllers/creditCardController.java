package com.carvajal.crudCreditCards.controllers;



import com.carvajal.crudCreditCards.models.creditCardModel;
import com.carvajal.crudCreditCards.services.creditCardService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cards")
public class creditCardController {

    @Autowired
    creditCardService creditCardService;

    @GetMapping("/getAll")
    @ApiOperation("Get All creditCards")
    private ResponseEntity<List<creditCardModel>> getAllCards(){
        return ResponseEntity.ok(creditCardService.getAllCards());
    }

    @PostMapping("/save")
    @ApiOperation("Save a creditCard")
    public ResponseEntity<creditCardModel> saveCard(@RequestBody creditCardModel creditCardModel){

        try
        {
            creditCardModel creditCardSaved = creditCardService.saveCreditCard(creditCardModel);
            return ResponseEntity.created(new URI("/creditCards/"+creditCardSaved.getNumber())).body(creditCardSaved);
        }
        catch (Exception e)
        {
            return new ResponseEntity<creditCardModel>(creditCardModel, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    @ApiOperation("Update a creditCard")
    private ResponseEntity<creditCardModel> update(@PathVariable("id") Integer id, @RequestBody creditCardModel creditCardModel)
    {
        try
        {
            creditCardModel creditCardUpdated = creditCardService.updatecreditCard(id,creditCardModel);
            return ResponseEntity.created(new URI("/creditCards/"+creditCardUpdated.getNumber())).body(creditCardUpdated);
        }
        catch (Exception e)
        {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(path = "/delete/{id}")
    @ApiOperation("Delete CreditCard by Id")
    public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){
        boolean ok = this.creditCardService.deleteCreditCard(id);

        if (ok) return ResponseEntity.ok("Se eliminó la tarjeta de crédito con número " + id);
        else return ResponseEntity.badRequest().body("No se pudo eliminar el la tarjeta de cŕedito con número " + id);
    }

}
