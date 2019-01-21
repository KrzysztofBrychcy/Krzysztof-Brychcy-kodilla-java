package com.kodilla.hibernate2.task.dao;

import com.kodilla.hibernate2.task.Task2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Transactional
@Repository
public interface Task2Dao extends CrudRepository<Task2, Integer> {
    List<Task2> findByDuration(int duration);
}
