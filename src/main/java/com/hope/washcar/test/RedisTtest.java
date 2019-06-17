package com.hope.washcar.test;

import com.hope.washcar.common.RedisUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * RedisTtest
 *
 * @author zhougf
 * @date 2019/6/14
 */
public class RedisTtest {
    public static void main(String[] args) {
        String[] path = {"redis-config.xml"};
        ApplicationContext container =
                new ClassPathXmlApplicationContext(path);
        RedisUtil redisUtil = (RedisUtil)container.getBean("RedisUtil");
        redisUtil.set("y","y");
//        Jedis jedis = new Jedis("localhost");
//        System.out.println("连接成功");
//        //查看服务是否运行
//        System.out.println("服务正在运行: "+jedis.ping());
    }
}
