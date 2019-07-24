package com.hope.corejava.stream;

import com.hope.corejava.stream.bean.User;

import java.util.HashMap;
import java.util.Map;

/**
 * StreamTest
 *
 * @author zhougf
 * @date 2019/7/24
 */
public class StreamTest {

    public void MapTest() {
        Map<String, User> map = new HashMap<>(16);
        map.put("user1",new User("zs1",20));
        map.put("user2",new User("zs2",20));
        map.put("user3",new User("zs3",20));
        map.put("user4",new User("zs4",20));
        map.put("user5",new User("zs5",20));
        map.entrySet();

    }
}
