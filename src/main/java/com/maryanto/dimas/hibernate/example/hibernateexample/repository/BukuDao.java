package com.maryanto.dimas.hibernate.example.hibernateexample.repository;

import com.maryanto.dimas.hibernate.example.hibernateexample.entity.Buku;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(readOnly = true)
public class BukuDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(readOnly = false)
    public void save(Buku buku){
        this.sessionFactory.getCurrentSession().save(buku);
    }
}
