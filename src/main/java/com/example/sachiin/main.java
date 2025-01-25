package com.example.sachiin;

import com.example.sachiin.config.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class main {
    public static void main(String[] args) {
        Session sessionFactoryConfiguration = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = sessionFactoryConfiguration.beginTransaction();

    }
}
