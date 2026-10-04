package com.example.alpha.kafka;

import com.example.alpha.message.Message;
import com.example.alpha.message.MessageRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private MessageRepository messageRepository;

    public KafkaConsumer(MessageRepository messageRepository){
        this.messageRepository=messageRepository;
    }

    @KafkaListener(
            topics = "messages",
            groupId = "alpha-group"
    )
    public void consumer(String message){
        System.out.println("Received message: " + message);

        messageRepository.save(new Message(null, message));
    }

}
