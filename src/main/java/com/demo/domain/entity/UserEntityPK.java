package com.demo.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class UserEntityPK implements Serializable {

        @Column(name = "id")
        private long id;
        @Column(name="user_id",nullable = false,updatable = false)
        private String userId;
}
