package com.example.springbootproject.entity;

import com.example.springbootproject.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Port extends BaseEntity {
    String code;
    String name;


    @ManyToOne
    @JoinColumn(name="address_id", nullable=false)
    Address address;
    @OneToMany(mappedBy = "port")
    Set<Terminal> terminals;

    @OneToMany(mappedBy = "destination")
    Set<Shipment> shipments;
}
