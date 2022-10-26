package com.example.springbootproject.entity;

import com.example.springbootproject.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Shipment extends BaseEntity {

    Date departure;
    Date arrival;
    @ManyToOne
    @JoinColumn(name="port_id", nullable=false)
    Port destination;
    @ManyToOne
    @JoinColumn(name="ship_id", nullable=false)
    Ship carrier;
}
