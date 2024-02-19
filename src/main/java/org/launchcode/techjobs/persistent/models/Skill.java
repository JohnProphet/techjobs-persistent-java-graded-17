package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@NotNull
public class Skill extends AbstractEntity {
    @ManyToMany(mappedBy = "skills")
    private List<Job>jobs;
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

//    @OneToMany
//    @JoinColumn(name="employer_id")
//    private List<Job> jobs = new ArrayList<>();

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

