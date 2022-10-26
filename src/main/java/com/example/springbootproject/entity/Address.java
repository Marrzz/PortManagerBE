package com.example.springbootproject.entity;

import com.example.springbootproject.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Address extends BaseEntity {
    String streetName;
    String StreetNumber;
    String postalCode;

    @ManyToOne
    @JoinColumn(name="country_id", nullable=false)
    Country country;
    @ManyToOne
    @JoinColumn(name="coordinates_id", nullable=false)
    Coordinates coordinates;
    @OneToMany(mappedBy="address")
    Set<Port> ports;
}
