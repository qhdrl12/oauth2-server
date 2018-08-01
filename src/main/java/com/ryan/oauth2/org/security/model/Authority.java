package com.ryan.oauth2.org.security.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authority")
public class Authority implements Serializable {

    private static final long serialVersionUID = -3257581232010544976L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
