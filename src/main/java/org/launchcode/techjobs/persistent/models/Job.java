package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Job extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 75)
    @ManyToOne
    private Employer employer;
    private String skills;

    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer employer, String someSkills) {
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

}
