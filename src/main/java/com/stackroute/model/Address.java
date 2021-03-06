package com.stackroute.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

        private int plotNumber;
        private String area;
        private String city;
        private String state;
        private String country;
        private int pincode;
    }


