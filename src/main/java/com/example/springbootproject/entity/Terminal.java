package com.example.springbootproject.entity;

import com.example.springbootproject.common.BaseEntity;
import com.example.springbootproject.common.ETerminalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Terminal extends BaseEntity {
    String name;
    @Enumerated(EnumType.STRING)
    ETerminalType type;
    @ManyToOne
    @JoinColumn(name="port_id", nullable=false)
    Port port;
}
