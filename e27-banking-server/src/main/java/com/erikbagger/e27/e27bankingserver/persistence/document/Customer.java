package com.erikbagger.e27.e27bankingserver.persistence.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@Data
public class Customer {

    private String id;
    private String name;
    private String surname;
}
