package com.ly.gcdemo;

/**
 * 老年代GC + 新生代GC (动态年龄判断)
 */
public class Demo3 {
    public static void main(String[] args) {
        byte[] array1 = new byte[2 * 1024 * 1024];
        array1 = new byte[2*1024*1024];
        array1 = new byte[2*1024*1024];
        array1 = null;

        byte[] array2 = new byte[128 * 1024];

        byte[] array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[2*1024*1024];
        array3 = new byte[2*1024*1024];
        array3 = new byte[128*1024];
        array3 = null;

        byte[] array4 = new byte[2 * 1024 * 1024];
        

    }
}
