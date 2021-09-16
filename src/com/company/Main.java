package com.company;

import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// variable test
          Main test = new Main();
          test.switchTest2();
          //test.firstTest();
//          short a = 10;
//          a+=2;
         // a = a+2;  +=
//        test.ComputeLearning();
//        boolean x = true;
//        boolean y = false;
//        short z = 42;
//        if(y==true)
//        if((z++ == 42)&&(y=true)) z++;
//        if((x=false) || (++z==45)) z++;
//        System.out.println(z);

    }
    void VariableTest(){
        byte b1 = 12;
        byte b2 = -128;
        long l1 = 241234124123213l ;
        float f1 = 1.23f;
        double d1 = 1.234;
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '\u0043';
        boolean bo1 = true;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(l1);
        System.out.print(c1);
        System.out.print(c2);
        System.out.println("test");
        System.out.println(c3);
        if(bo1){
            System.out.println("hahaha\\n");
        }else{
            System.out.println("what");
        }
    }

//byte, short, char-->int-->long-->float-->double
    //不同类型运算时，自动提升为大容量类型
    //char和short运算结果为int
    //char和byte运算时为int
    //byte, char, short运算结果都为int, 包括同种类型运算, char + char = int
    //整型变量默认为int, 浮点型默认为double
    void VariableTest1(){
        byte b1 = 2;
        int i1 = 12;
        int i2 = i1 + b1;
        float f1 = i2;
        short s1 = 1;
        short s2 = 2;
        System.out.println(f1);
    }
    //当左边为false时，&会继续执行右边，&&不会
    //同理|和||
    //推荐使用||和&&
    void ComputeLearning(){
        boolean b = true;
        int a = 10;
        int a1 = 10;
        if (b | (a++>0)){
            System.out.println("true"+a);
        }else {
            System.out.println("false"+a);
        }
        if(b || (a1++>0)){
            System.out.println("真的"+a1);
        }else {
            System.out.println("假的"+a1);
        }
    }
    void StringLearning() {

        String s1 = "什么东西abcわたし";
        System.out.println(s1 instanceof String);
        String s2 = new String("efg");
        String s3 = new String();
        System.out.println(s1);
        System.out.println(s2);
        char c = 'a';
        int n = 10;
        String st = "hello";
        System.out.println("*"+"\t"+"*");
        System.out.println(4 + "");  //107hello
        System.out.println(c+st+n);  //ahello10
        System.out.println(c+(n+st)); //a10hell0
        System.out.println((c+n)+st); //107hello
        System.out.println(st+n+c);  //hello10a
        short as = 4;
        as++;
        byte b = 127;
        b++;
        char c3 = 5;
        char c4 = '5';



        int i1 = (int) c4;
        int i = 1;
        i *=0.1;
        System.out.println("i:"+i);
        float f1 = 2.5f;
        float f2  = 10.6f;
        float f3 = f2%f1;
        short ss1 = 3;
        ss1+=2; //不会改变数据类型
        //ss1 = ss1 + 2; 数据类型被改变为int

        System.out.println(b);
    }


    void ifTest() throws IOException {
        int heartBeats = 60;
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        //Scanner.next() will ignore enter and tap, while nextLine() will regard them as input
        //second input method bufferReader
        //third method System.in.read
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char crr = (char) System.in.read();
        if (score == 100) {
            System.out.println("BMW");
        } else if(score<=99&&score>80){
            System.out.println("iphoneX");
        } else if(score >= 60 && score <= 80 ){
            System.out.println("nothing");
        }
        //switch allowed data structure: byte, short, char, int, String, enum
        switch (heartBeats) {
            case 100 :
                System.out.println("what？");
                break;
            case 1000:
                System.out.println("die");
                break;
            default:
                System.out.println("suibian");
        }
    }


    void firstTest(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println(max);
        System.out.println("enter two number");
        double a1 = in.nextDouble();
        double a2 = in.nextDouble();
        if (a1 > 10.0 && a2 < 20.0){
            System.out.println(a1+a2);
        }else{
            System.out.println(a1*a2);
        }
        System.out.println("enter two String");
        String s1 = in.next();
        String s2 = in.next();
        System.out.println("s1:"+s1+"\n"+"s2:"+s2);
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("s1:"+s1+"\n"+"s2"+s2);
    }


    void ifTest2(){
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double age = 0;
        double b = Math.random() * 90.0 + 10;
        if ( a >= 0 && a <=2 ){
            age = a * 10.5;
        }else if (a > 2){
            age = 2 * 10.5 + (a - 2) * 4;
        }else {
            System.out.println("Invalid");
            return;
        }
        System.out.println("your height: (cm)");
        int height = input.nextInt();
        System.out.println("your money: (million)");
        double fortune = input.nextDouble();
        System.out.println("handsome? (true/false)");
        boolean hand = input.nextBoolean();
        if (height>180 && fortune > 10 && hand){
            System.out.println("husband");
        }else if(height>180 || fortune > 10 || hand){
            System.out.println("let me think");
        }else{
            System.out.println("no way");
        }
    }
    void switchTest(){
        Scanner input = new Scanner(System.in);
        String a = input.next();
        char c = a.charAt(0);
        switch (c){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                c = Character.toUpperCase(c);
                break;
            default:
                System.out.println("other");
                return;
        }
        System.out.println(c);
    }

    void switchTest2(){
        Scanner input = new Scanner(System.in);
        System.out.println("please input year: ");
        int year = input.nextInt();
        int feb = 0;
        if (year % 4 == 0){
            if (year % 100 != 0){
                feb = 29;
            }else if(year % 400 == 0){
                feb = 29;
            }else {
                feb = 28;
            }
            }else {
            feb = 28;
        }
        System.out.println("please input month: ");
        int month = input.nextInt();
        if (month < 1 || month > 12){
            System.out.println("invalid input");
            return;
        }
        System.out.println("Please input day: ");
        int day = input.nextInt();
        if (day < 1 || day > 31){
            System.out.println("invalid input");
            return;
        }
        int date = 0;
        switch(month){
            case 12:
                date += 30;
            case 11:
                date += 31;
            case 10:
                date += 30;
            case 9:
                date += 31;
            case 8:
                date += 31;
            case 7:
                date += 30;
            case 6:
                date += 31;
            case 5:
                date += 30;
            case 4:
                date += 31;
            case 3:
                date += feb;
            case 2:
                date += 31;
            default:
                date += day;
                break;
        }
        System.out.println("today is the "+date+" day of this year");
    }
}

