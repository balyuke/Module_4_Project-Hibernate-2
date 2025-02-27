package com.javarush.balyuk.dao;

import com.javarush.balyuk.entity.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GenericDAO<Address>{
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
