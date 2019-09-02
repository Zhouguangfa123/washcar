package com.hope.activemq.consumer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * AppConsumer
 *
 * @author zhougf
 * @date 2019/08/22
 */
public class AppConsumer {
    private static final String URL = "tcp://127.0.0.1:61616";

    private static final String QUEUE_NAME = "queue-test";

    private static final int SEND_COUNT = 100;

    public static void main(String[] args) throws JMSException {
        //1.创建连接工厂
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
        //创建消费者
        MessageConsumer messageConsumer = session.createConsumer(destination);
        //创建监听
        messageConsumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                System.out.println("接受消息" + message);
            }
        });


//        connection.close();

    }
}
