package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@NotNull
public class Skill extends AbstractEntity {
    @NotNull
    @Size(min = 3, max = 250)
    private String description;

    public String getDescription() {
        return description;
    }
    @NotNull
    public void setDescription(String newDescription) {
        description = newDescription;
    }
    public Skill() {}
}

