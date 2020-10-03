package com.cxj.day01.codes.DemonDay01;
//对于重载，方法名相同参数个数不同，以及参数类型不同；在重载时，相同参数个数时不得类型相同
public class MethodLeadisSame {
    public static void main(String[] args) {
        int a=10;
        int b=13;
        System.out.println(isSame(a,b));
        System.out.println(isSame(34L,45L));
        System.out.println(isSame((short) a, (short) b));
        System.out.println(isSame(23D,56D));
        System.out.println(isSame((byte)a,(byte) b));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("byte调用参数");
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
    public  static boolean isSame(short a,short b){
        System.out.println("short调用参数");
        boolean result = a == b ? true : false;
        return result;
    }
    public static boolean isSame(int a, int b){
        System.out.println("int调用参数");
        boolean result = a==b ? true :false;
        return result;
    }
    public static boolean isSame(double a, double b){
        System.out.println("double调用参数");
        return a==b;
    }

    public static boolean isSame(float a , float b){
        System.out.println("float调用参数");
        boolean result = a==b ? true : false;
        return result;
    }
}
