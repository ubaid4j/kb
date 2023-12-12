package dev.ubaid.labs.kb.listener;

import dev.ubaid.labs.kb.config.KafkaTopics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NameListener {
    
    private static final Logger log = LoggerFactory.getLogger(NameListener.class);
    
    @KafkaListener(topics = KafkaTopics.NAME_TOPIC)
    public void onNameEvent(String name) {
        log.info("///////////////////////// on name event: {}", name);
    }
}
