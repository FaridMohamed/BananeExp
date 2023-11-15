package com.bananeexp.servicebananeexp.entities;

import java.io.Serializable;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class AbstraitEntiti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date creationDate;

    private Date updateDate;

}
