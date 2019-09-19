package com.ly.gcdemo;

/**
 * 一次minor gc后，有一部分对象保存在survivor中，一部分对象进入老年代
 */
public class Demo5 {
    public static void main(String[] args) {
        byte[] array1 = new byte[2 * 1024 * 1024];
        array1 = new byte[2*1024*1024];
        array1 = new byte[2*1024*1024];

        byte[] array2 = new byte[128 * 1024];
        array2 = null;

        byte[] array3 = new byte[2 * 1024 * 1024];
    }
}
