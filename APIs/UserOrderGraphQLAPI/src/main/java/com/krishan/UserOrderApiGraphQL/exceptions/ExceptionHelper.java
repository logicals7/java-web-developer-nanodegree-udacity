package com.krishan.UserOrderApiGraphQL.exceptions;

public class ExceptionHelper {
    public static RuntimeException ResourceNotFoundException(){
        return new RuntimeException("Resource not found...");
    }
}
