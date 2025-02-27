package com.javarush.balyuk.dao;

import com.javarush.balyuk.entity.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category>{
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
