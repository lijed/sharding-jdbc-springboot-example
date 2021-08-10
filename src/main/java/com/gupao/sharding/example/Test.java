/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.gupao.sharding.example;

import java.io.*;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/8/10
 **/
public class Test {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        // Send all output to the Appendable object sb
        Formatter formatter = new Formatter(sb, Locale.US);
        //%4$  Index
        formatter.format("%4$4s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
        System.out.println(sb.toString());

       String result  =  String.format("%s  %s  %s  %s", 1 , 2 ,3, 4, 5);
        System.out.println(result);


        result  =  String.format("%s  %s  %<s  %s", 1 , 2 ,3, 4, 5);
        System.out.println(result);

         result =String.format("%h", 100);
        System.out.println(result);


        String s2 = String.format("Duke's Birthday: %1$tm %<te,%<tY", Calendar.getInstance());
        System.out.println(s2);

        System.out.println(Integer.toHexString(100));

        for (Byte dat: "abc".getBytes()) {
            String byteStr = String.format("%02x", dat);
            System.out.println(byteStr);
        }

    }
}
