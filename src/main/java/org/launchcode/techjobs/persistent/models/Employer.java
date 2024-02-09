package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

// Employer is a class that will be mapped to one of our tables. Make sure the class has the
// @Entity annotation, as well as the no-arg constructor required for Hibernate to create an
// object.

// public class Employer {}
@Entity
@NotNull
public class Employer extends AbstractEntity {
    @NotNull
    @Size(min = 3, max = 75)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }
    public Employer() {}
}




