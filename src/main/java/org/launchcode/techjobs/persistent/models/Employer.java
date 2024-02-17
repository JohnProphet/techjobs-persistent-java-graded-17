package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

// Employer is a class that will be mapped to one of our tables. Make sure the class has the
// @Entity annotation, as well as the no-arg constructor required for Hibernate to create an
// object.

@Entity
public class Employer extends AbstractEntity {
    @NotNull
    @Size(min = 3, max = 75)
    private String location;
    @OneToMany(mappedBy = "jobs")
    @JoinColumn(name="employer")
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> newJobs) {
        jobs = newJobs;
    }

    public Employer() {}
}