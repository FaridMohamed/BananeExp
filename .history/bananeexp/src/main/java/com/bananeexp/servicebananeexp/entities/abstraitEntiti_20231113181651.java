package com.bananeexp.servicebananeexp.entities;

import java.io.Serializable;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class AbstraitEntiti implements Serializable{
    
    private Integer id;

    private Date creationDate;

    private Date 

    
}
