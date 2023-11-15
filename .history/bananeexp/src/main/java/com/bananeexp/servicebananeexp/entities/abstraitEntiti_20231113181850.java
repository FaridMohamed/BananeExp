package com.bananeexp.servicebananeexp.entities;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@D
@MappedSuperclass
public class AbstraitEntiti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date creationDate;

    private Date updateDate;

}
