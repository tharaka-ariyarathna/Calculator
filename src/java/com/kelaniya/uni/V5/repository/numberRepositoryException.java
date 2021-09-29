package com.kelaniya.uni.V5.repository;

import java.io.IOException;

public class numberRepositoryException extends Throwable {
    public numberRepositoryException(Exception e, String messege) {
        super(messege, e) ;
    }
}
