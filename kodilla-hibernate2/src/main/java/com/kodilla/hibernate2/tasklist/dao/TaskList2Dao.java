package com.kodilla.hibernate2.tasklist.dao;

import com.kodilla.hibernate2.tasklist.TaskList2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskList2Dao extends CrudRepository<TaskList2, Integer> {
    List<TaskList2> findByListName(String listName);
}
