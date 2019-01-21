package com.kodilla.hibernate2.task.dao;

import com.kodilla.hibernate2.task.TaskFinancialDetails2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskFinancialDetails2Dao extends CrudRepository<TaskFinancialDetails2, Integer> {
    List<TaskFinancialDetails2> findByPaid(boolean paid);
}
