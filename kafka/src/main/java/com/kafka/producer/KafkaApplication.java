package com.kafka.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class KafkaApplication {

	Logger log = LoggerFactory.getLogger(KafkaApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
		
		
//		Properties p = new Properties();
//		p.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.29.10.136:9092");
//		p.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//		p.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//		
//		KafkaProducer<String, String> producer= new KafkaProducer<>(p);
//		ProducerRecord<String ,String> rec= new ProducerRecord<String, String>("ordertopic", "hello");
//		producer.send(rec);
		
		
		
		
		
		
		
	}

}
