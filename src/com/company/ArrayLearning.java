package com.company;



//数组是引用类型
//数组创建在内存钟开辟一整块连续空间，数组名引用空间首地址
//与数组对比，链表是不连续空间
//数组长度一旦确定无法修改
//char型数组默认初始化为'0', String为null, boolean为false

import java.util.Collections;
import java.util.Scanner;

public class ArrayLearning {
    public void arrayTest(){
        int[] ids = new int[]{123,1234,12345};
        String[] ids2 = new String[5];
        int[][] arr1 = new int[][]{{1,2,3},{11,12},{4,5,6}};
        int[][] arr2 = new int[3][2];
        int[][] arr3 = new int[3][];
        System.out.println(arr3[0]);
        System.out.println(ids2[0]);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);
        System.out.println(arr1[2].length);
        for(int[] a:arr1){
            System.out.println(a);
        }
        for(int i = 0; i < arr1[1].length; i++){
            System.out.println(arr1[1][i]);
        }
    }

    public int[] printScore() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生人数: ");
        int count = input.nextInt();
        System.out.println("\n" + "请输入" + count + "个成绩：");
        int[] score = new int[count];
        int max = 0;
        for (int i = 0; i < count; i++) {
            score[i] = input.nextInt();
            max = max > score[i] ? max : score[i];
        }
        System.out.println("最高分是：" + max);
        char level;
        for (int i = 0; i < count; i++) {
            if (max - 10 < score[i]) {
                level = 'A';
            } else if (max - 20 < score[i]) {
                level = 'B';
            } else if (max - 30 < score[i]) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student " + i + " score is " + score[i] + ", grade is " + level);
        }
        return score;
    }

//    数组的内存解析
//    stack and heap, method area(store Runtime Constant Pool and static field)
//      局部变量在stack里，new出的在heap里  int[] arr = new int[3]; address in stack and content in heap
    public void practice1(){
        int[][] arr = {{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    //杨辉三角
    public void practice2(){
        int[][] arr = new int[10][];
        for(int i = 0; i < 10; i++){
            arr[i] = new int[i+1];
        }
        for(int i = 0; i < 10; i++){
            for (int j = 0; j <= i; j++){
                if( j==0 || j==i) {
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public void practice3(){
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++){
            arr[i] = (int)(Math.random()*30);
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    arr[i] = (int)(Math.random()*30);
                    j = 0;
                }
            }
            System.out.print(i+": ");
            System.out.println(arr[i]);
        }
    }

    public void practice4(){
        int[] arr = new int[10];
        int max = 0, sum = 0, min = 100;
        double avg;
        for(int i = 0; i < 10; i++){
            arr[i] = (int) (Math.random()*100);
            sum+=arr[i];
            max = max > arr[i] ? max : arr[i];
            min = min < arr[i] ? min : arr[i];
            System.out.print(arr[i]+" ");
        }
        avg = max/10;
        System.out.println("\n和: " + sum+"\t最大值: "+ max +"\t最小值: "+ min + "\t平均值: "+ avg);
    }

    //数组反转
    public void reverse(){
        String[] arr = new String[]{"120", "12"};
        for (int i = 0; i < arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

    }

    //线性查找和二分法查找
    public void search(){
        int[] arr = new int[12];
        int target = 123;
        boolean isFlag = true;
        //线性
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.print(i);
                isFlag = false;
                break;
            }
        }

        //二分法
        //the array must be sorted
        int head = 0, end = arr.length-1;

        while(head < end){
            int middle = (head + end)/2;
            if (target > arr[middle]){
                head = middle+1;
            }else if(target < arr[middle]){
                end = middle-1;
            }else{
                System.out.println(middle);
                isFlag = false;
                break;
            }
        }


        //差值法
        //middle = (target - arr[head])/(arr[end] - target)*(head+end)
        if(isFlag) System.out.println("not found");

    }


    //算法特征： 输入，输出，有穷性finiteness, 确定性definiteness（也有不确定性算法，概率算法，并行算法等）, 可行性effectiveness
    //排序算法
    //衡量： 时间复杂度，空间复杂度，稳定度（相同值的数据顺序是否会变动）
    //分类： 内部排序和外部排序  是否需要外部存储器还是只在内存里操作
    //十大排序方法：
    //选择排序: 直接选择排序，堆排序
    //交换排序：冒泡排序，快速排序
    //插入排序：直接插入排序，折半插入排序，shell排序
    //归序排序
    //桶式排序
    //基数排序

    //冒泡排序 bubble sort
    public void bubbleSort(){
        int[] arr = new int[]{4,3,4,5,2,34,2,12,42,43,342,2,-24,-55,-1,0};
        int length = arr.length;
        for(int i = 0; i < length-1; i++){
            for(int j = 0; j < length-1-i; j++)
                  if(arr[j] > arr[j+1]) {
                      swap(arr, j, j+1);
                  }
        }
        for(int a : arr){
            System.out.print(a+"  ");
        }
    }

    //快速排序
    public void quickSort(int[] arr, int start, int end){
        int base = arr[start];
        int low = start;
        int high = end;
        if (low >= high) {
            return;
        }
        while (low < high){
            while ((arr[high] >= base) && (high > start)) high--;
            while((arr[low] <= base) && (low < end)) low++;
            if(low < high) swap(arr, low, high);
        }
        swap(arr, start, high);
        quickSort(arr, start, high-1);
        quickSort(arr, high+1, end);
    }

    public void quickSort2(int[] arr, int low, int high) {
        // low,high 为每次处理数组时的首、尾元素索引

        //当low==high是表示该序列只有一个元素，不必排序了
        if (low >= high) {
            return;
        }
        // 选出哨兵元素和基准元素。这里左边的哨兵元素也是基准元素
        int i = low, j = high, base = arr[low];
        while (i < j) {
            //右边哨兵从后向前找
            while (arr[j] >= base && i < j) {
                j--;
            }
            //左边哨兵从前向后找
            while (arr[i] <= base && i < j) {
                i++;
            }
            swap(arr,i,j);  //交换元素
        }
        swap(arr,low,j);  //基准元素与右哨兵交换

        //递归调用，排序左子集合和右子集合
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);

    }

    public void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
