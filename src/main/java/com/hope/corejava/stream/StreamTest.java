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
        map.put("user3", new User("zs3", 20));
        map.put("user2", new User("zs2", 20));
        map.put("user5", new User("zs5", 20));
        map.put("user4", new User("zs4", 20));
        Set<String> setKey = map.keySet();
        String[] keys = setKey.toArray(new String[setKey.size()]);
        User[] values = map.values().toArray(new User[setKey.size()]);
        Set<Map.Entry<String, User>> entrySet = map.entrySet();
        Stream<Map.Entry<String, User>> stream = entrySet.stream();
        //final ���ε� Collectors �� �м������� ���Է����ռ���
        Collector listCollector = Collectors.toList();
        Collectors.toSet();
        keys = Stream.of(keys).map(String::toUpperCase).toArray(String[]::new);
        keys = Arrays.stream(keys).map(str -> str + "ss").sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(keys));

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
        map.put(null, null);
        System.out.println(map.get(null));
        //�����Դ�� null�� �Ϳ�ֵ �̰߳�ȫ
        Map<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,null);
        //���ָ���쳣
        System.out.println(hashtable.get("1"));
        //���� �����Զ�����
        Map<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("2", "2");
        linkedHashMap.put("1", "1");
        System.out.println(linkedHashMap);
        //�̳� Hashtable<Object,Object> ��Ҫ���ڶ�ȡ�����ļ�
        Properties properties = System.getProperties();
        properties.list(System.out);

        //�Զ�����
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("2", "2");
        treeMap.put("1", "1");
        System.out.println(treeMap);
    }

    @Test
    public void mouseTest() {
        ArrayList<String> integers = new ArrayList<>(16);
        for (int i = 1; i < 65; i++) {
            String str = Integer.toBinaryString(i);
            integers.add(formatString(str, 6, '0'));
        }
        //1�������  ��һλΪ1��ҩ
        ArrayList<String> list1 = integers.stream().filter(str -> str.charAt(0) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //2������ ��  �ڶ�λΪ1��ҩ
        ArrayList<String> list2 = integers.stream().filter(str -> str.charAt(1) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //3������ ��  ����λΪ1��ҩ
        ArrayList<String> list3 = integers.stream().filter(str -> str.charAt(2) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //4������ ��  ����λΪ1��ҩ
        ArrayList<String> list4 = integers.stream().filter(str -> str.charAt(3) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //5������ ��  ����λΪ1��ҩ
        ArrayList<String> list5 = integers.stream().filter(str -> str.charAt(4) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //6������ ��  ����λΪ1��ҩ
        ArrayList<String> list6 = integers.stream().filter(str -> str.charAt(5) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println("1 �ųԵģ�");
        System.out.println(list1);
        System.out.println("2 �ųԵģ�");
        System.out.println(list2);
        System.out.println("3 �ųԵģ�");
        System.out.println(list3);
        System.out.println("4 �ųԵģ�");
        System.out.println(list4);
        System.out.println("5 �ųԵģ�");
        System.out.println(list5);
        System.out.println("6 �ųԵģ�");
        System.out.println(list6);
        //������1��2��3������ ��ô
        System.out.println("����1,2,3���ˣ�");
        System.out.println("1,2,3���Թ���Ҳ���ǿ����ж���");
        //����1,2,3λ����1��
        ArrayList<String> list123 = integers.stream().filter(str -> str.charAt(0) == '1' && str.charAt(1) == '1' &&
                str.charAt(2) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(list123);
        System.out.println("4��5,6�Ե����е����� ��û��");
        //����4,5,6λ����1��
        ArrayList<String> list456 = integers.stream().filter(str -> str.charAt(3) == '1' || str.charAt(4) == '1' ||
                str.charAt(5) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(list456);
        //����list123��list456���ֵ�Ҳ����û����
        list123 = list123.stream().filter(str -> !list456.contains(str)).collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println("1,2,3���Թ���Ҳ���ǿ����ж��� û�г����� 456ȫ���Ե��г��ֵľ����ж���");
        System.out.println(list123);
        System.out.println("�ó�����123���� ���� 111000��56���ж��� 12���˾��� 110000��48���ж������������� ����λΪ1ʣ��Ϊ0");



    }


    public static String formatString(String str, int len, char c) {
        // �п�Ϊ�ո�ֵ�մ�
        if (str == null) {
            str = "";
        }

        // λ���������ַ�c����
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < len) {
            sb.insert(0, c);
        }

        return sb.toString();
    }


}
