package com.cham.reactivekafka.controller;

import com.cham.reactivekafka.consumer.ReactiveKafkaConsumer;
import com.cham.reactivekafka.domain.Tweet;
import com.cham.reactivekafka.producer.ReactiveKafkaProducer;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class TweetController {

    @Autowired
    private ReactiveKafkaProducer reactiveKafkaProducer;

    @Autowired
    private ReactiveKafkaConsumer reactiveKafkaConsumer;

    @GetMapping(value = "/api/stream/trades")
    public ResponseEntity<String> getTradeStream() {
        log.info("Inside TweetController.getTradeStream..");
        Tweet tweet = new Tweet("1", "Chaminda", "I love Scala");
        reactiveKafkaProducer.sendMessages(tweet);
        reactiveKafkaConsumer.consumeMessages();
        return ResponseEntity.ok().body("Send to the kafka topic");
    }

}
