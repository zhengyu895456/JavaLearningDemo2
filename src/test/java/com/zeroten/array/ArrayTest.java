package com.zeroten.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    @Test
    public void testArrayDeclare(){
        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];
    }
    @Test
    public void testFuzhi(){
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));
        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = new String[3];
        System.out.println(Arrays.toString(arr3));
        Object[] arr4 = new Object[5];
        System.out.println(Arrays.toString(arr4));
        int[] arr5;
        System.out.println();
        arr5 = new int[2];
        System.out.println(Arrays.toString(arr5));
        int[] arr6 = new int[]{3,2,4};
        System.out.println("arr6=" + Arrays.toString(arr6));
        int[] arr7 = {4,3,2};
        System.out.println("arr7=" + Arrays.toString(arr7));
        String[] arr8 = {"字符串1", null, "字符串2", ""};
        System.out.println("arr8=" + Arrays.toString(arr8));
        Integer[] arr9 = {2,9,7,null,0,5};
        System.out.println("arr9=" + Arrays.toString(arr9));
    }
    @Test
    public void testBianLi(){
        Integer[] arr = {1,2,3,4,5};
        for (int index = 0; index < arr.length; index++){
            //System.out.println("下标：" + index + "，存放的值是："+ arr[index]);
            System.out.println(String.format("下标：%d, 存放的值是：%d", index, arr[index]));
        }
        int index = 0;
        for (int val : arr){
            System.out.println("第" + index + "次取到" + val);
            index++;
        }
        Arrays.asList(arr).forEach(val -> {
            System.out.println("值是：" + val);
            if (val % 2 == 0){
                System.out.println("  它是一个偶数");
            }else{
                System.out.println("  它是一个奇数");
            }
        });
    }
    @Test
    public void testCopy(){
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9,10};
        //拷贝arr1的前3个元素生成一个新数组
        Integer[] arr11 = new Integer[3];
        arr11[0] = arr1[0];
        arr11[1] = arr1[1];
        arr11[2] = arr1[2];
        System.out.println("arr11 = "+Arrays.toString(arr11));
        Integer[] arr12 = Arrays.copyOf(arr1,3);
        System.out.println("arr12 = "+Arrays.toString(arr12));
        //拷贝数组arr1的后3位的元素到一个新数组
        Integer arr13[] = Arrays.copyOfRange(arr1,arr1.length-3,arr1.length);
        System.out.println("arr13 = "+Arrays.toString(arr13));
        //拷贝数组arr1的第1位到第3位到一个新数组
        Integer arr14[] = Arrays.copyOfRange(arr1,0,2);
        System.out.println("arr14 = "+Arrays.toString(arr14));
        //拷贝数组arr2的后3位到arr1的后3位
        System.arraycopy(arr2,arr2.length - 3, arr1,arr1.length-3,3);
        System.out.println("arr1 = " + Arrays.toString(arr1));
    }
    @Test
    public void testFill(){
        //定义一个大小为10的int数组，并将数组全部初始化为5，打印数组；
        //然后将数组后三位赋值为3，再次打印数组。
        int[] arr = new int[10];
        //for (int index = 0; index < arr.length; index++){
        //    arr[index] = 5;
        //}
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));
        //for (int index = arr.length - 3; index < arr.length; index++){
        //    arr[index] = 3;
        //}
        Arrays.fill(arr,arr.length - 3, arr.length, 3);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,3,3,3);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testSort() {
        //定义一个大小为100的int数组，随机给每一位赋值一个0~100的数值，然后对该数组进行排序，打印排序结果
        int[] arr = new int[100];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
