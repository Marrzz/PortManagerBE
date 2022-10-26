package com.example.springbootproject.entity;


import com.example.springbootproject.common.BaseEntity;
import com.example.springbootproject.common.EShipSizeClass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Ship extends BaseEntity {

    @Enumerated(EnumType.STRING)
    EShipSizeClass sizeClass;
    @ManyToOne
    @JoinColumn(name="country_id", nullable=false)
    Country flagState;
    //Two foot equivalent units that can fit on the ship
    Double maxTEU;
    @OneToMany(mappedBy = "carrier")
    Set<Shipment> shipments;

}
