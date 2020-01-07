package com.zeroten.Collection;

import java.util.*;

public class ListStudy {
    //List 主要有两种：ArrayList和LinkedList
    //ArrayList：内部是使用数组实现的
    //LinkedList：内部使用的是一个双向链表来实现
    //创建：无参数构建；有参数构造 1指定容量大小 2复制已存在的List来创建
    //添加：1 头插；2 尾插； 3 中间插入
    //删除：1 头删；2 尾删； 3 中间删除
    //遍历：
    //  1：使用for循环
    //  2：使用迭代器 Iterator，ListIterator
    //  3：使用迭代器对List进行添加、删除操作
    //  4：迭代器的使用注意事项：在使用迭代器对列表进行操作时，原对象不能发生结构性变化，否则迭代器操作会抛异常
    //底层实现原理及主要JDK源码：内部存储结构、添加/删除/遍历操作的流程
    //对List进行排序：冒泡、插入、选择
    private static void addNumberToList(List<Integer> list, int count, int number){
        long start = System.currentTimeMillis();
        for(int i = 0; i < count; i++){
            list.add(number);
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }
    private static void studyArrayListOp(){
        //创建ArrayList时，如果未指定容量大小，则会创建一个空数组
        //第一次调用add方法时，会将容量扩充为默认容量大小DEFAULT_CAPACITY
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        int count = 2000000;
        list1.add(0,100);
        System.out.println(list1);
        list1.add(3,20);
        System.out.println(list1);
        list1.set(2,33);
        //addNumberToList(list1, count, 1);
        System.out.println(list1);

        //删除
        list1.remove(1);
        System.out.println(list1);
        list1.remove(list1.size() - 1);
        System.out.println(list1);
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Integer num : list1){
            System.out.println(num);
        }
        //如果在创建ArrayList时，能预估数据规模，
        //我们就可以指定一个初始容量大小，以减少扩容操作
        List<Integer> list2 = new ArrayList<>(count);
        //addNumberToList(list2, count,1);
//        for (Integer n : list1){
//            list2.add(n);
//        }
        //System.out.println("list2=" + list2);
        //数组是有容量大小限制的，当add操作时，如果数组已满就会引发扩容
        //1.计算新的容量大小：原来容量的1.5倍
        //2.按新的容量大小创建一个新数组
        //3.将旧数组里的元素全部复制到新创建的数组中
        //4.丢弃旧的数组
    }
    private static void listIterator(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator = list.listIterator();
//        System.out.println("hasPrevious=" + listIterator.hasPrevious());
//        System.out.println("hasNext=" + listIterator.hasNext());
//        System.out.println("previousIndex=" + listIterator.previousIndex());
//        System.out.println("nextIndex=" + listIterator.nextIndex());
//        System.out.println("next()=" + listIterator.next());
//        System.out.println("hasPrevious=" + listIterator.hasPrevious());
//        System.out.println("hasNext=" + listIterator.hasNext());
//        System.out.println("previousIndex=" + listIterator.previousIndex());
//        System.out.println("nextIndex=" + listIterator.nextIndex());
//        System.out.println(list);
//        listIterator.set("A-Update");
//        System.out.println(list);
//        listIterator.add("A-New");
//        System.out.println(list);
//        System.out.println("previous=" + listIterator.previous());
//        //System.out.println("next=" + listIterator.next());
//        listIterator.set("A-Update2");
//        System.out.println(list);
//        listIterator.remove();
//        System.out.println(list);
//        System.out.println("next=" + listIterator.next());
//        listIterator.remove();
//        System.out.println(list);

        //迭代器操作元素的时候，
        //set和remove方法和迭代器的状态有关，更新或者删除的是上一次调用next或者previous方法返回的元素
        //add只和迭代器的位置有关，在当前迭代器位置之前添加元素
//        System.out.println(list);
//        listIterator.next();
//        listIterator.next();
//        System.out.println("next=" + listIterator.next());
//        //listIterator.set("Update");
//        list.add("New1");
//        list.add("New2");
//        System.out.println(list);

        System.out.println(listIterator.next());
        //list.add("D");//modCount++
        list.set(1,"B1");//修改原值，不属于结构化修改
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
    }
    public static void studyLinkedList(){
        //链表，创建时不需要指定容量大小，因为没有大小限制
        List list1 = new LinkedList();
        list1.add("A");
        list1.add("B");
        System.out.println(list1);
        List list2 = new LinkedList(list1);
        System.out.println(list1);
        //其余操作和ArrayList一样
    }
    private static void listOpTime(List<Integer> list){
        int times = 200000;
        //for 循环遍历
        //对于LinkedList每次get(index)，都会从头开始查找
        //
        long start = System.currentTimeMillis();
        for(int i = 0; i < list.size(); i++){
            int n = list.get(i);
        }
        System.out.printf("[%s] for循环遍历耗时 %dms\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);
        //Iterator
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
        }
        System.out.printf("[%s] 迭代器遍历耗时 %dms\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);
        //for-each
        start = System.currentTimeMillis();
        for(Integer n : list){
        }
        System.out.printf("[%s] for-each循环遍历耗时 %dms\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);
        //在第5位插入10000个1
        start = System.currentTimeMillis();
        for(int i = 0; i < times; i++){
            list.add(4,1);
        }
        System.out.printf("[%s] 第5位插入 %dms\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);
        //在末尾插入10000个2
        start = System.currentTimeMillis();
        for(int i = 0; i < times; i++){
            list.add(2);
        }
        System.out.printf("[%s] 末尾插入 %dms\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);
    }
    public static void main(String[] args){
        //studyArrayListOp();
        //listIterator();
        //studyLinkedList();
        //ArrayList和LinkedList区别
        //ArrayList长于随机快速访问，而从列表中间删除/插入元素很慢
        //LinkedList长于从列表中间删除/插入元素，但随机访问很慢
        //随机访问：list.get(index)，通过索引来访问
        List<Integer> list = new ArrayList<>();
        fill(list);
        listOpTime(list);
        List<Integer> list2 = new LinkedList<>();
        fill(list2);
        listOpTime(list2);
    }
    private static void fill(List<Integer> list){
        for(int i = 0; i < 10000; i++){
            list.add(i);
        }
    }
}
