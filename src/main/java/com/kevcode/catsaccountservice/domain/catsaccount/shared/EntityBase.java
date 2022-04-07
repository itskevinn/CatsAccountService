package com.kevcode.catsaccountservice.domain.catsaccount.shared;


import javax.persistence.*;

@MappedSuperclass
public class EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}