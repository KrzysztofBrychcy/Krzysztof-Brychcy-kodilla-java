package com.kodilla.hibernate2.task.dao;

import com.kodilla.hibernate2.task.TaskFinancialDetails2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetails2DaoTestSuite {
    @Autowired
    TaskFinancialDetails2Dao taskFinancialDetails2Dao;

    @Test
    public void testFindByPaid() {
        //Give
        TaskFinancialDetails2 taskFinancialDetails2 = new TaskFinancialDetails2(new BigDecimal(115), false);
        taskFinancialDetails2Dao.save(taskFinancialDetails2);
        int id = taskFinancialDetails2.getId();
        //When
        List<TaskFinancialDetails2> resultList = taskFinancialDetails2Dao.findByPaid(false);
        //Then
        Assert.assertEquals(1, resultList.size());
        System.out.println(resultList);
        //CleanUp
        taskFinancialDetails2Dao.delete(id);
    }
}
