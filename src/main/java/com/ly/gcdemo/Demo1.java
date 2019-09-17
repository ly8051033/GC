package com.ly.gcdemo;

/**
 * 新生代GC
 */
public class Demo1 {

    public static void main(String[] args) {
        byte[] bytes1 = new byte[1024 * 1024];
        bytes1 = new byte[1024*1024];
        bytes1 = new byte[1024*1024];
        bytes1 = null;

        byte[] bytes2 = new byte[2 * 1024 * 1024];
        
    }
}
