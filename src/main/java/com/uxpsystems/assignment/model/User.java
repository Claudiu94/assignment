package com.uxpsystems.assignment.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="User")
public class User {

    public enum Status {ACTIVATED, DEACTIVATED}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Size(min=3, max=30)
    @Column(name = "username", nullable = false, unique = true)
    String username;

    @Size(min=6, max=20)
    @Column(name = "password", nullable = false)
    String password;

    @Enumerated(EnumType.STRING)
    @Column(length = 11)
    Status status;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
