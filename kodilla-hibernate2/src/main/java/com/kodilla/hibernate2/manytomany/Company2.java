package com.kodilla.hibernate2.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMPANIES_2")
public class Company2 {
    private int id;
    private String name;
    private List<Employee2> employee2s = new ArrayList<>();

    public Company2() {
    }

    public Company2(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee2> getEmployee2s() {
        return employee2s;
    }

    public void setEmployee2s(List<Employee2> employee2s) {
        this.employee2s = employee2s;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
