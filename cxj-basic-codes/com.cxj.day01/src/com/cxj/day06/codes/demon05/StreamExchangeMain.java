package com.cxj.day06.codes.demon05;

import java.io.*;

public class StreamExchangeMain {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("com.cxj.day01\\GBK.text"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("com.cxj.day01\\UTF-8.text"),"utf-8");
        int line = 0;
        while((line = isr.read())!=-1){
            osw.write(line);
        }
        osw.close();
        isr.close();
    }

}
