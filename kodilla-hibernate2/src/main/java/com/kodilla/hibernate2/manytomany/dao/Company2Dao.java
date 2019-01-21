package com.kodilla.hibernate2.manytomany.dao;

import com.kodilla.hibernate2.manytomany.Company2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Transactional
@Repository
public interface Company2Dao extends CrudRepository<Company2, Integer> {
}
