// APPAPPLICS.java
package com.demo.postman_ui.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "APPAPPLICS")
public class APPAPPLICS {

    @Id
    private Long id;

    private String name;
    private String idRefnum;

    // Getters and setters
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

    public String getIdRefnum() {
        return idRefnum;
    }

    public void setIdRefnum(String idRefnum) {
        this.idRefnum = idRefnum;
    }
}
