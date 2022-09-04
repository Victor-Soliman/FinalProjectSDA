package main.exceptions;

import lombok.Value;

import java.util.List;

@Value
public class ErrorResponse {

    String message;
    List<String> detailes;


}
