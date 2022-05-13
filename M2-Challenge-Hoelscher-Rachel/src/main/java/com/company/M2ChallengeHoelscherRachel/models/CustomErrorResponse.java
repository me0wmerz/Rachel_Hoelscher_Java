package com.company.M2ChallengeHoelscherRachel.models;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

public class CustomErrorResponse {

    @RestControllerAdvice
    public class ControllerExceptionHandler {

        @ExceptionHandler(value = {NoDividingByZeroesException.class})
        public ResponseEntity<CustomErrorResponse> handleNoDividingByZeroesException(NoDividingByZeroesException e) {
            CustomErrorResponse response = new CustomErrorResponse(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
            return responseEntity;
        }
    }


}
