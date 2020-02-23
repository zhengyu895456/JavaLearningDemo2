package com.zeroten.Collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    //LinkedHashMap具有和HashMap一样的功能
    //增强：保持元素的插入顺序
    //LinkedHashMap在HashMap的基础上增加了如下内容：
    //head指向按插入顺序，第一个元素的引用
    //tail指向按插入顺序，最后一个元素的引用
    //对每一个元素的对象，Entry or Node增加了两个属性
    //1. before指向按插入顺序前一个元素的引用
    //2. after指向按插入顺序后一个元素的引用
    public static void main(String[] args){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "第一");
        linkedHashMap.put(5, "第五");
        linkedHashMap.put(3, "第三");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + "=" +entry.getValue());
        }
        //WeakHashMap，当里面的某个元素不再被使用时，可以被垃圾回收器回收
        //EnumMap，Key值必须是枚举类型
        //IdentityHashMap，Key值的hash值计算方式：System.identityHashcode(Key)，而通常是“key值对象.hashCode()”
    }
}
