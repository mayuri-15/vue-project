package com.vuespringboot.project.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PeopleInformation")
public class PeopleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "job")
    private String job;

    public PeopleInfo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PeopleInfo)) return false;
        PeopleInfo that = (PeopleInfo) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getJob(), that.getJob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getJob());
    }

    @Override
    public String toString() {
        return "PeopleInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
