package com.github.chen0040.elasticsearch.server.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.allegro.tech.embeddedelasticsearch.EmbeddedElastic;
import pl.allegro.tech.embeddedelasticsearch.PopularProperties;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Configuration
public class BeanConfig {

    @Value("${elasticsearch.tcp_comm_port}")
    private int tcpPort;

    @Value("${elasticsearch.cluster_name}")
    private String esClusterName;

    @Bean
    public EmbeddedElastic elasticSearch() throws IOException, InterruptedException {
        return EmbeddedElastic.builder()
                .withElasticVersion("5.0.0")
                .withSetting(PopularProperties.TRANSPORT_TCP_PORT, tcpPort)
                .withSetting(PopularProperties.CLUSTER_NAME, esClusterName)
                //.withPlugin("analysis-stempel")
                .withSetting("http.cors.allow-origin", "*")
                .withStartTimeout(60L, TimeUnit.SECONDS)
                .withSetting("http.cors.enabled", true)
                .withInstallationDirectory(new File("/tmp/es"))
                .build();
    }
}
