package com.javarush.balyuk.dao;

import com.javarush.balyuk.entity.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment>{

    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
