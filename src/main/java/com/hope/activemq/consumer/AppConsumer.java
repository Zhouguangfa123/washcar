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
        //1.�������ӹ���
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        ((ActiveMQConnectionFactory) connectionFactory).setBrokerURL(URL);
        //��������
        Connection connection = connectionFactory.createConnection();
        //��������
        connection.start();
        //�����Ự
        Session session=  connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //����Ŀ��
        Destination destination = session.createQueue(QUEUE_NAME);
        //����������
        MessageConsumer messageConsumer = session.createConsumer(destination);
        //��������
        messageConsumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                System.out.println("������Ϣ" + message);
            }
        });


//        connection.close();

    }
}
