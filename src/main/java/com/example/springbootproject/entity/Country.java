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
public class Country extends BaseEntity {
    String name;
    String alpha2Code;
    String alpha3Code;

    @OneToMany(mappedBy = "flagState")
    Set<Ship> ships;

    @OneToMany(mappedBy = "country")
    Set<Address> addresses;


}
