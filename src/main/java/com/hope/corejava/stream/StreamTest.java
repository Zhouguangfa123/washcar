package com.hope.corejava.stream;

import com.hope.corejava.stream.bean.User;
import org.junit.Test;

import java.security.Provider;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StreamTest
 *
 * @author zhougf
 * @date 2019/7/24
 */
public class StreamTest {
    @Test
    public void streamTest() {
        Map<String, User> map = new HashMap<>(16);
        map.put("user1", new User("zs1", 20));
        map.put("user2", new User("zs2", 20));
        map.put("user3", new User("zs3", 20));
        map.put("user4", new User("zs4", 20));
        map.put("user5", new User("zs5", 20));
        Set<String> setKey = map.keySet();
        String[] keys = setKey.toArray(new String[setKey.size()]);
        User[] values = map.values().toArray(new User[setKey.size()]);
        Set<Map.Entry<String, User>> entrySet = map.entrySet();
        Stream<Map.Entry<String, User>> stream = entrySet.stream();
        //final 修饰的 Collectors 类 有几个方法 可以返回收集器
        Collector listCollector = Collectors.toList();
        Collectors.toSet();
        System.out.println(stream.collect(Collectors.toList()));

    }

    @Test
    public void collectionTest() {
        //底层数组  有序（存储顺序） 可重复
        Collection arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(0);
        System.out.println(arrayList);

        //底层是链表 有序（存储顺序） 可重复
        Collection linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(0);
        System.out.println(linkedList);

        //底层是HashMap 无序（数据会自动排序） 不可重复
        Set<Integer> set = new HashSet<>(16);
        set.add(1);
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(0);
        System.out.println(set);

        Set linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(7);
        linkedHashSet.add(0);
        System.out.println(set);
    }

    @Test
    public void mapTest() {
        //可以存放 null键 和空值 线程不安全 无序
        Map<String, User> map = new HashMap<>(16);
        map.put(null,null);
        System.out.println(map.get(null));
        //不可以存放 null键 和空值 线程安全
        Map<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,null);
        //会空指针异常
        System.out.println(hashtable.get("1"));
        //有序 不会自动排序
        Map<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("2","2");
        linkedHashMap.put("1","1");
        System.out.println(linkedHashMap);
        //继承 Hashtable<Object,Object> 主要用于读取配置文件
        Properties properties = System.getProperties();
        properties.list(System.out);

        //自动排序
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("2","2");
        treeMap.put("1","1");
        System.out.println(treeMap);
    }
}
