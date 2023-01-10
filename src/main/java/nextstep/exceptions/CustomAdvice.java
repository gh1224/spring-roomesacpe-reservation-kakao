package nextstep.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomAdvice {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity handle() {
        return ResponseEntity.badRequest().body("CustomException");
    }
}
