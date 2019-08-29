package rnd.statemachine;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurnstileController {
	

    @PostMapping("/turnstile/payment")
    public TurnstileData validatePayment(@Valid @RequestBody TurnstileData turnstileData) throws Exception {
    	if(turnstileData.getPayment()<=0) {
    		throw new BadDataException("Payment value must be more than 0.00");
    	}
    	return turnstileData;
    }
    
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleException(BadDataException e) {
    	ErrorResponse resp = new ErrorResponse();
    	resp.setError(e.getMessage());
    	return resp;
    }
    
}

