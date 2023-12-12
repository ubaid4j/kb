package dev.ubaid.labs.kb.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopics {
    
    public static final String NAME_TOPIC = "name";
    

    @Bean
    public NewTopic name() {
        return TopicBuilder
                .name(NAME_TOPIC)
                .partitions(10)
                .replicas(1)
                .build();
    }
}
