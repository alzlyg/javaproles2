package ru.zlygostev;

import org.junit.Test;
import ru.zlygostev.Database.DBConfig;

public class ConnectionUrlTest {
    @Test
    public void test() {
        final DBConfig config = new DBConfig();
        config.setDriverName("com.mysql.jdbc.Driver");
        config.setDatabaseType("mysql");
        config.setDatabaseName("exampleASZ");
        config.setHost("localhost");
        config.setPort(3306);

        System.out.println(config);
    }
}
