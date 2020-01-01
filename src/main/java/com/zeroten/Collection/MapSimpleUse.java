package com.zeroten.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapSimpleUse {
    public static void main(String[] args){
        //map 键值对，包括键值、值；
        //可以通过键值快速找到对应的值
        //示例：
        //001 -> {name: 张三，age: 20 ...}
        //特性：
        //1. 键值不能重复
        //2. put方法如果键值已经存在，那么会用新值替换旧值，并且返回旧值
        //3. 键值可以是null吗？可以
        //4. 值可以是null吗？可以
        Map<Integer, String> map = new HashMap<>();
        String putRet1 = map.put(1, "张三，20");
        System.out.println("返回旧值：" + putRet1);
        String putRet2 = map.put(1, "王五，23");
        System.out.println("返回旧值：" + putRet2);
        map.put(2, "李四，21");
        String val1 = map.get(1);
        System.out.println(val1);

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //map.put(null,"没有人");
        //map.put(null,"没有人2");
        map.put(3,null);
        map.put(null,null);
        map.remove(2);
        System.out.println(map);
    }
}
