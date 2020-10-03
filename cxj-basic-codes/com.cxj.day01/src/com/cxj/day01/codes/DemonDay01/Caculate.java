package com.cxj.day01.codes.DemonDay01;

public class Caculate {
    public static void getSum1(){
        int sum=0;
        int i;
        for (i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void getSum2(){
        int j=1,sum1=0;
        do {
            sum1=sum1+j;
            j++;
        }while(j<=100);
        System.out.println(sum1);
        int m=1,sum2=0;
        while (m<=100){
            sum2=sum2+m;
            m++;
        }
        System.out.println(sum2);
    }
    public static void Sum3(){
        for(int ii=1;ii<=10;ii++){
            for(int jj=1;jj<=ii;jj++){
                int sum3=ii*jj;
                System.out.print(sum3+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Sum3();
        getSum1();
        getSum2();
    }
}

