package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacadeCompanyEmployee {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;


    public List<Company> findCompany(String companyName) {
        List<Company> companies = companyDao.retrieveFindComp(companyName);
        return companies;
    }

    public List<Employee> findEmployee(String employeeName) {
        List<Employee> employees = employeeDao.retrieveLastNam(employeeName);
        return employees;
    }


}
