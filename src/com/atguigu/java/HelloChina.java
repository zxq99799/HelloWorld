package com.atguigu.java;

/**
 * @author zxq
 * @date 2020/4/14 - 21:09
 */
public class HelloChina {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        double total = 0;
        for (int i = 0; i <myList.length ; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);

        double max =myList[0];
        for (int i = 0; i <myList.length ; i++) {
            if (myList[i] > max){
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);
    }

}
