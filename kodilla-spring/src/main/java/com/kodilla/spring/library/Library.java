package com.kodilla.spring.library;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private final List<String> books =  new ArrayList<>();
    private LibrabryDBController librabryDBController;

    public Library(final LibrabryDBController librabryDBController) {
        this.librabryDBController = librabryDBController;
    }

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
