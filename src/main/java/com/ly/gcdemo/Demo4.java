package com.ly.gcdemo;

/**
 * 15次进入老年代
 */
public class Demo4 {
    public static void main(String[] args) {
        
        // 一次minor gc
        byte[] array1 = new byte[2 * 1024 * 1024];
        array1 = new byte[2*1024*1024];
        array1 = new byte[2*1024*1024];
        array1 = null;

        byte[] array2 = new byte[128 * 1024];

        byte[] array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[2*1024*1024];
        array3 = new byte[2*1024*1024];
        array3 = null;

        // 两次
        byte[] array4 = new byte[2 * 1024 * 1024];
        
        array4 = new byte[2*1024*1024];
        array4 = new byte[2*1024*1024];
        array4 = null;

        // 3
        byte[] array5 = new byte[2 * 1024 * 1024];
        array5 = new byte[2*1024*1024];
        array5 = new byte[2*1024*1024];
        array5 = null;

        // 4
        byte[] array6 = new byte[2 * 1024 * 1024];
        array6 = new byte[2*1024*1024];
        array6 = new byte[2*1024*1024];
        array6 = null;

        // 5
        byte[] array7 = new byte[2 * 1024 * 1024];
        array7 = new byte[2*1024*1024];
        array7 = new byte[2*1024*1024];
        array7 = null;

        //6
        byte[] array8 = new byte[2 * 1024 * 1024];
        array8 = new byte[2*1024*1024];
        array8 = new byte[2*1024*1024];
        array8 = null;

        
        // 7
        byte[] array9 = new byte[2 * 1024 * 1024];
        array9 = new byte[2*1024*1024];
        array9 = new byte[2*1024*1024];
        array9 = null;

        // 8
        byte[] array10 = new byte[2 * 1024 * 1024];
        array10 = new byte[2*1024*1024];
        array10 = new byte[2*1024*1024];
        array10 = null;

        // 9
        byte[] array11 = new byte[2 * 1024 * 1024];
        array11 = new byte[2*1024*1024];
        array11 = new byte[2*1024*1024];
        array11 = null;

        // 10 
        byte[] array12 = new byte[2 * 1024 * 1024];
        array12 = new byte[2*1024*1024];
        array12 = new byte[2*1024*1024];
        array12 = null;

        // 11
        byte[] array13 = new byte[2 * 1024 * 1024];
        array13 = new byte[2*1024*1024];
        array13 = new byte[2*1024*1024];
        array13 = null;

        // 12
        byte[] array14 = new byte[2 * 1024 * 1024];
        array14 = new byte[2*1024*1024];
        array14 = new byte[2*1024*1024];
        array14 = null;

        // 13
        byte[] array15 = new byte[2 * 1024 * 1024];
        array15 = new byte[2*1024*1024];
        array15 = new byte[2*1024*1024];
        array15 = null;

        // 14
        byte[] array16 = new byte[2 * 1024 * 1024];
        array16 = new byte[2*1024*1024];
        array16 = new byte[2*1024*1024];
        array16 = null;

        // 15
        byte[] array17 = new byte[2 * 1024 * 1024];
     
        
        
        
        
    }
}
