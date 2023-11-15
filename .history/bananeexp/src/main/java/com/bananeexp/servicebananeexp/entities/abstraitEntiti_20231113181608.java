package com.bananeexp.servicebananeexp.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class AbstraitEntiti implements Serializable{
    
    private Integer id;

    
}
