package com.javarush.balyuk.dao;

import com.javarush.balyuk.entity.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store>{

    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
