package com.erikbagger.e27.e27bankingserver.persistence.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@Data
public class Account {

    @Id
    private String id;

    @DBRef
    private Customer customer;
    private Double balance;
}
