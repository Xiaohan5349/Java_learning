package com.company;

import java.util.Locale;
import java.util.Scanner;

public class FamilyAccount {
     int[] sum = new int[1000];
     int[] input = new int[1000];
     int count = 0;
     int count2;
     String[] description = new String[1000];
     String[] simpledes = new String[1000];
     public void inital(){
         Scanner in = new Scanner(System.in);
         boolean isFllag = true;
         lable: while(isFllag) {
             System.out.println("-----------------家庭收支记账软件-----------------");
             System.out.println();
             System.out.println("                   1 收支明细                    ");
             System.out.println("                   2 登记收入                    ");
             System.out.println("                   3 登记支出                    ");
             System.out.println("                   4 退   出                    ");
             System.out.println();
             System.out.print("                   请选择(1-4): ");
             int i = in.nextInt();
             sum[0] = 1000;
             input[0] = 0;
             simpledes[0] = "N/A";
             description[0] = "N/A";
             switch (i){
                 case 1:{
                     System.out.println("-----------------当前收支明细记录-----------------");
                     System.out.println("收支\t账户金额\t收支金额\t说明\t");
                     count2 = 0;
                    while(count2 <= count){
                        System.out.println(simpledes[count2]+"\t"+sum[count2]+"\t"+input[count2]+"\t"+description[count2]);
                        count2++;
                    }
                     System.out.println();
                     System.out.println();
                     System.out.println();
                    break;
                 }
                 case 2:{
                     count++;
                     System.out.println("本次收入金额：");
                     input[count] = in.nextInt();
                     sum[count] = sum[count-1] + input[count];
                     System.out.println("本次收入说明：");
                     description[count] = in.next();
                     simpledes[count] = "收入";
                     System.out.println();
                     System.out.println();
                     System.out.println();
                     break;
                 }
                 case 3:{
                     count++;
                     System.out.println("本次支出金额：");
                     input[count] = in.nextInt();
                     while(input[count] > sum[count-1]){
                         System.out.println("你要破产啦！！！！请为了自己考虑，合理消费，让我们重新决定花多少钱吧1");
                         input[count] = in.nextInt();
                     }
                     sum[count] = sum[count-1] - input[count];
                     System.out.println("本次支出说明：");
                     description[count] = in.next();
                     simpledes[count] = "支出";
                     System.out.println();
                     System.out.println();
                     System.out.println();
                     break;
                 }
                 case 4:{
                     System.out.print("确认是否退出<Y/N>: ");
                     String exit = in.next().toUpperCase(Locale.ROOT);
                     while (!(exit.equals("N") || exit.equals("Y"))) {
                         System.out.println("无效输入，请重新输入");
                         exit = in.next();
                     }

                     if(exit.equals("Y")){
                         System.out.println();
                         System.out.println();
                         System.out.println();
                         isFllag = false;
//                         break lable;
                     }
                     break;


                 }
                 default:{
                     System.out.println("对不起，功能尚在开发中");
                     System.out.println();
                     System.out.println();
                     System.out.println();
                     break;
                 }
             }

         }
         System.out.println("谢谢您使用家庭收支记账软件，我们下次再见");
         return;
     }
}
