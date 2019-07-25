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
        //final ���ε� Collectors �� �м������� ���Է����ռ���
        Collector listCollector = Collectors.toList();
        Collectors.toSet();
        System.out.println(stream.collect(Collectors.toList()));

    }

    @Test
    public void collectionTest() {
        //�ײ�����  ���򣨴洢˳�� ���ظ�
        Collection arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(0);
        System.out.println(arrayList);

        //�ײ������� ���򣨴洢˳�� ���ظ�
        Collection linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(0);
        System.out.println(linkedList);

        //�ײ���HashMap �������ݻ��Զ����� �����ظ�
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
        //���Դ�� null�� �Ϳ�ֵ �̲߳���ȫ ����
        Map<String, User> map = new HashMap<>(16);
        map.put(null,null);
        System.out.println(map.get(null));
        //�����Դ�� null�� �Ϳ�ֵ �̰߳�ȫ
        Map<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,null);
        //���ָ���쳣
        System.out.println(hashtable.get("1"));
        //���� �����Զ�����
        Map<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("2","2");
        linkedHashMap.put("1","1");
        System.out.println(linkedHashMap);
        //�̳� Hashtable<Object,Object> ��Ҫ���ڶ�ȡ�����ļ�
        Properties properties = System.getProperties();
        properties.list(System.out);

        //�Զ�����
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("2","2");
        treeMap.put("1","1");
        System.out.println(treeMap);
    }
}
