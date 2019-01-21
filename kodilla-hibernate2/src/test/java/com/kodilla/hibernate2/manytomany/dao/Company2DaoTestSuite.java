package com.kodilla.hibernate2.manytomany.dao;

import com.kodilla.hibernate2.manytomany.Company2;
import com.kodilla.hibernate2.manytomany.Employee2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Company2DaoTestSuite {
    @Autowired
    Company2Dao company2Dao;

    @Test
    public void testSaveManyToMany() {
        //Give
        Employee2 johnSmith = new Employee2("John", "Smith");
        Employee2 stephanieClarkson = new Employee2("Stephanie", "Clarckson");
        Employee2 lindaKovalsky = new Employee2("Linda", "Kovalsky");

        Company2 softwareMachine = new Company2("Software Machine");
        Company2 dataMaesters = new Company2("Data Maesters");
        Company2 greyMatter = new Company2("Grey Matter");

        softwareMachine.getEmployee2s().add(johnSmith);
        dataMaesters.getEmployee2s().add(stephanieClarkson);
        dataMaesters.getEmployee2s().add(lindaKovalsky);
        greyMatter.getEmployee2s().add(johnSmith);
        greyMatter.getEmployee2s().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarkson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        //When
        company2Dao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        company2Dao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        company2Dao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
        System.out.println(softwareMachineId);
        System.out.println(dataMaestersId);
        System.out.println(greyMatterId);
        //CleanUp
        try{
            company2Dao.delete(softwareMachineId);
            company2Dao.delete(dataMaestersId);
            company2Dao.delete(greyMatterId);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak:\n" + e);
        }

    }
}
