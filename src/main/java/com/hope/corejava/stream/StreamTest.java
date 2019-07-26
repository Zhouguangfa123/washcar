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
        //final 修饰的 Collectors 类 有几个方法 可以返回收集器
        Collector listCollector = Collectors.toList();
        Collectors.toSet();
        keys = Stream.of(keys).map(String::toUpperCase).toArray(String[]::new);
        keys = Arrays.stream(keys).map(str -> str + "ss").sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(keys));

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
        map.put(null, null);
        System.out.println(map.get(null));
        //不可以存放 null键 和空值 线程安全
        Map<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,null);
        //会空指针异常
        System.out.println(hashtable.get("1"));
        //有序 不会自动排序
        Map<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("2", "2");
        linkedHashMap.put("1", "1");
        System.out.println(linkedHashMap);
        //继承 Hashtable<Object,Object> 主要用于读取配置文件
        Properties properties = System.getProperties();
        properties.list(System.out);

        //自动排序
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
        //1号老鼠喝  第一位为1的药
        ArrayList<String> list1 = integers.stream().filter(str -> str.charAt(0) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //2号老鼠 喝  第二位为1的药
        ArrayList<String> list2 = integers.stream().filter(str -> str.charAt(1) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //3号老鼠 喝  第三位为1的药
        ArrayList<String> list3 = integers.stream().filter(str -> str.charAt(2) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //4号老鼠 喝  第四位为1的药
        ArrayList<String> list4 = integers.stream().filter(str -> str.charAt(3) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //5号老鼠 喝  第五位为1的药
        ArrayList<String> list5 = integers.stream().filter(str -> str.charAt(4) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        //6号老鼠 喝  第六位为1的药
        ArrayList<String> list6 = integers.stream().filter(str -> str.charAt(5) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println("1 号吃的：");
        System.out.println(list1);
        System.out.println("2 号吃的：");
        System.out.println(list2);
        System.out.println("3 号吃的：");
        System.out.println(list3);
        System.out.println("4 号吃的：");
        System.out.println(list4);
        System.out.println("5 号吃的：");
        System.out.println(list5);
        System.out.println("6 号吃的：");
        System.out.println(list6);
        //假如入1，2，3，死了 那么
        System.out.println("假如1,2,3死了：");
        System.out.println("1,2,3都吃过的也就是可能有毒的");
        //即第1,2,3位都是1的
        ArrayList<String> list123 = integers.stream().filter(str -> str.charAt(0) == '1' && str.charAt(1) == '1' &&
                str.charAt(2) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(list123);
        System.out.println("4，5,6吃的所有的如下 都没毒");
        //即第4,5,6位都是1的
        ArrayList<String> list456 = integers.stream().filter(str -> str.charAt(3) == '1' || str.charAt(4) == '1' ||
                str.charAt(5) == '1').collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(list456);
        //过滤list123在list456出现的也就是没毒的
        list123 = list123.stream().filter(str -> !list456.contains(str)).collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println("1,2,3都吃过的也就是可能有毒的 没有出现在 456全部吃的中出现的就是有毒的");
        System.out.println(list123);
        System.out.println("得出结论123死了 就是 111000（56号有毒） 12死了就是 110000（48号有毒）即几号死了 几号位为1剩下为0");



    }


    public static String formatString(String str, int len, char c) {
        // 判空为空赋值空串
        if (str == null) {
            str = "";
        }

        // 位数不够用字符c补充
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < len) {
            sb.insert(0, c);
        }

        return sb.toString();
    }


}
