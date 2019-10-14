package com.ly.kafkademo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerDemo {
    private static final String brokerList = "localhost:9092";
    public static final String topic = "topic-demo";
    
    public static Properties initConfig(){
        Properties props = new Properties();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        props.put(ProducerConfig.ACKS_CONFIG,"0");
        return props;
    }

    public static void main(String[] args) {
        Properties props = initConfig();
        KafkaProducer<String,String> kafkaProducer = new KafkaProducer<String, String>(props);
        ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>(topic, topic,"Hello,kafka");
        try{
            kafkaProducer.send(producerRecord);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
