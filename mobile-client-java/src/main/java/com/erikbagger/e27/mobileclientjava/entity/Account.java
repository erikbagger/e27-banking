package com.erikbagger.e27.mobileclientjava.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Account {

    private final String id;
    private final String name;
    private final String surname;
    private final double balance;

}
