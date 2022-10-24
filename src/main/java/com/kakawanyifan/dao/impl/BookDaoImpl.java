package com.kakawanyifan.dao.impl;

import com.kakawanyifan.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        for (int i = 0; i < 3; i++) {
            System.out.println("book dao save ...");
        }
    }

    public void update() {
        System.out.println("book dao update ...");
    }

    public void delete() {
        System.out.println("book dao delete ...");
    }

    public void select() {
        System.out.println("book dao select ...");
    }
}
