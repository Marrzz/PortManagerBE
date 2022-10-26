package com.example.springbootproject.entity;


import com.example.springbootproject.common.BaseEntity;
import com.example.springbootproject.common.EContainerType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Container extends BaseEntity {
    String code;
    @Enumerated(EnumType.STRING)
    EContainerType type;
    boolean isFull;
    @ManyToMany(mappedBy = "containers")
    Set<ContainerSize> sizes;

}
