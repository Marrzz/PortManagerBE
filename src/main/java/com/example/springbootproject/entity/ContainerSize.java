package com.example.springbootproject.entity;

import com.example.springbootproject.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class ContainerSize extends BaseEntity {

    Double internalHeight;
    Double internalWidth;
    Double height;
    Double cubicCapacity;
    Double payloadCapacity;
    Double tareWeight;
    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(name = "Containersize_Container",
                    joinColumns ={@JoinColumn(name = "containersize_id")},
                    inverseJoinColumns = { @JoinColumn(name = "container_id")})
    Set<Container> containers;
}
