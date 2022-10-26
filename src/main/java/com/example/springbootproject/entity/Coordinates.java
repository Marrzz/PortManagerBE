package com.example.springbootproject.entity;

import com.example.springbootproject.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Coordinates  extends BaseEntity {

    String latitude;
    String longitude;
    @OneToMany(mappedBy = "coordinates")
    Set<Address> addresses;
}
