package by.alina.banking.accountservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyEntityNotFoundException extends EntityNotFoundException {

    public MyEntityNotFoundException (Long id){
        super("Entity = " + id + " isn't found!");
    }
}
