package com.tubecentric.webapplication.landing.entity;

import com.tubecentric.webapplication.framework.database.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name="subscriber")
public class Subscriber extends AbstractEntity {

    @Basic
    @Column(name="email", unique=true)
    private String email;
}
