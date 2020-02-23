package com.zeroten.Collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args){
        //HashMap无序
        //TreeMap有序，和前面的List有序不一样
        //1.构造
        //2.添加/删除/遍历/修改（CRUD-增删查改）
        TreeMap<XuHao, String> map = new TreeMap();
        //key - 学生序号
        //value - 学生的信息
        //对于TreeMap，key值对象必须实现了Comparable接口
        map.put(new XuHao(1),"张三,20");
        map.put(new XuHao(3),"李四,21");
        map.put(new XuHao(2),"王五,22");
        map.put(new XuHao(9),"九,22");
        map.put(new XuHao(5),"五,22");
        //Map 严格来说不是一个集合，但是它有三个视图，我们可以把这三个视图当成集合来使用
        //1.Key集
        //2.值集合
        //3.键值对集
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for(Map.Entry<XuHao, String> item : map.entrySet()){
            System.out.println(item.getKey() + "=" + item.getValue());
        }
        //TreeMap是有序的，指的是Key值的排序
        //那么Key是如何排序的？
        // 1. 构造TreeMap时，未指定排序器（即Comparator接口），那么Key值对象必须通过实现排序接口Comparable。
        // 2. 构造TreeMap时，指定了排序器，那么Key值对象可以不实现接口Comparable。
        //存放元素的时候，会调用Comparable接口的compareTo方法，默认按升序进行排序。
        //Comparable/Comparator这两个接口的区别？
        //Comparable比较的是自身和传入对象的大小
        //Comparator比较的是两个传入对象的大小
        //Comparable int compareTo(T o)
        //当put添加元素或者remove元素时，是使用比较器来进行比较两个元素是否相等，而不是equals。
        //优先使用构造时传入的Comparator，如果未指定则使用Key值对象的Comparable接口的compareTo方法
        map.remove(new XuHao(5));
        //System.out.println(map);
        String oldValue = map.put(new XuHao(5), "五-update");
        System.out.println(oldValue);
        System.out.println(map);
        //学生列表，既可以按学号正序排列，也可以反序排列
        //put/get/remove, key
        //1.计算key的hash值，即调用hashCode方法，而自定义对象默认的Object.hashCode是返回它的地址
        //2.hash % 桶数
        //3.比较key值是否相等，equals
    }

    static class XuHao implements Comparable{
        private Integer index; //学号
        public XuHao(Integer index){
            this.index = index;
        }
        @Override
        public String toString(){
            return "学号-" + index;
        }
        @Override
        public int compareTo(Object other){
            //-1 0 1
            if(other instanceof XuHao){
                XuHao xh = (XuHao) other;
                if(this.index < xh.index){
                    return -1;
                }
                if(this.index == xh.index){
                    return 0;
                }
                return 1;
            }
            return -1;
        }
    }
}
