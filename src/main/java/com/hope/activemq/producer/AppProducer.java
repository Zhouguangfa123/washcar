package com.hope.activemq.producer;


import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * AppProducer
 *
 * @author zhougf
 * @date 2019/08/22
 */
public class AppProducer {
    private static final String URL = "tcp://127.0.0.1:61616";

    private static final String QUEUE_NAME = "queue-test";

    private static final int SEND_COUNT = 100;

    public static void main(String[] args) throws JMSException {
        //1.创建连接
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        ((ActiveMQConnectionFactory) connectionFactory).setBrokerURL(URL);
        //创建连接
        Connection connection = connectionFactory.createConnection();
        //启动连接
        connection.start();
        //创建会话
        Session session=  connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //创建目标
        Destination destination = session.createQueue(QUEUE_NAME);
        //创建一个生产者
        MessageProducer messageProducer = session.createProducer(destination);
        //创建消息
        for (int i = 0; i < SEND_COUNT; i++){
            TextMessage textMessage = session.createTextMessage("test" + i);
            //发送消息
            messageProducer.send(textMessage);
            System.out.println("发送消息" + textMessage.getText());
        }

        connection.close();

    }
}
