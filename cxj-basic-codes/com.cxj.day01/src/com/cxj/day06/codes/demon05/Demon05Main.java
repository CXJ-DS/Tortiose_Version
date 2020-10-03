package com.cxj.day06.codes.demon05;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demon05Main {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\a.text", true);
        fos.write(21);

        byte[] bytes = {65, 66, 67, 68, 69, 70};
        fos.write(bytes);
        fos.write("你好".getBytes());
        fos.write("\r\n".getBytes());
        fos.close();
    }

}
