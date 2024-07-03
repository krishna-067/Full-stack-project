package com.employee.fullstackbackend.exception;
/* Created by Arjun Gautam */

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
