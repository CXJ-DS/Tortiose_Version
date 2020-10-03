package com.cxj.day06.codes.demon05;

import java.io.*;
import java.util.HashMap;

public class BufferedCopyMain {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> hm = new HashMap<>();
        //创建缓冲输入输出流时，在括号里面需要创建文件输出与输入语句
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\真的爱你.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\copy.txt"));
        String line;
        while((line= br.readLine())!=null){
            //这里创建line.split("\\.")不是直接创建数组，而是先写line.split("\\.").var回车进行创建相应的array数组
            String[] array = line.split("\\.");
            hm.put(array[0], array[1]);
        }

        for(String key: hm.keySet()){
            String value = hm.get(key);
            line = key + "." + value;
            bw.write(line);
            //获取的字符进行换行
            bw.newLine();
        }
        bw.close();
        br.close();
    }

}
