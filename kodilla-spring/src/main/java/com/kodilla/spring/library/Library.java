package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private final List<String> books =  new ArrayList<>();

    @Autowired
    private LibrabryDBController librabryDBController;

/*
    @Autowired
    public Library(LibrabryDBController librabryDBController) {
        this.librabryDBController = librabryDBController;
    }
*/
/*
    @Autowired
    public void setLibrabryDBController(LibrabryDBController librabryDBController) {
        this.librabryDBController = librabryDBController;
    }
*/

    public Library(){
        //do nothing
    }

    public void saveToDB(){
        librabryDBController.saveData();
    }

    public void loadFromDB(){
        librabryDBController.loadData();
    }
}
