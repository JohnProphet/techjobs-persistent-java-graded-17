package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Job extends AbstractEntity {


    @ManyToOne
    private Employer employer;
    @ManyToMany
    private List<Skill>skills = new ArrayList<>();

    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }


    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}