package com.dev.week.devweek.commons.config;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {
    

    /**
     * Bean to expose H2 database so GraphQL project can connect to it
    */
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemotyH2Database() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
    }
}
