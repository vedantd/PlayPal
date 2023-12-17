package com.vedantd.playpal.model;
import jakarta.persistence.*;

@Entity
@Table(name = "sports")
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean isPopular;

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isPopular=" + isPopular +
                '}';
    }

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

    public boolean isPopular() {
        return isPopular;
    }

    public void setPopular(boolean popular) {
        isPopular = popular;
    }

    public Sport() {
    }
}