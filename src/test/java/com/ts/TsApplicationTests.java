package com.ts;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

@SpringBootTest
class TsApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());


        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        connection.close();


    }


//
//    @Test
//    public void con(){
//     log.trace("这是运行日志");
//     log.debug("这是debug");
//     log.info("这是info");
//     log.warn("这是warn");
//     log.error("这是error");
//
//    }
}
