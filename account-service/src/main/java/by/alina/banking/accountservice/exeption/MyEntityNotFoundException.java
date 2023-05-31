package by.alina.banking.accountservice.exeption;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyEntityNotFoundException extends EntityNotFoundException {

    public MyEntityNotFoundException (Long id){
        super("Entity = " + id + " isn't found!");
    }
}
