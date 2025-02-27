Настройки подключения к БД:

        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        properties.put(Environment.DRIVER, "com.p6spy.engine.spy.P6SpyDriver");
        properties.put(Environment.URL, "jdbc:p6spy:mysql://localhost:3306/movie");
        properties.put(Environment.USER, "user");
        properties.put(Environment.PASS, "Qwerty135&");
        properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.put(Environment.HBM2DDL_AUTO, "validate");
        
В рамках реализации 6-9 пунктов задания реализованы методы:

6 - createCustomer(), 
7 - returnInventory(), 
8 - customerRentInventory(), 
9 - makeNewFilm()
        
