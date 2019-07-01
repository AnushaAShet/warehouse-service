package com.stackroute.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Partition {

    private String id;

    private String type;

    private String size;

    private int cost;
    private Tenant tenant;
}
