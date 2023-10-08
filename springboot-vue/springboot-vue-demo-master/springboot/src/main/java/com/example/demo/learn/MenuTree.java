package com.example.demo.learn;

public class MenuTree {

    public static void main(String []args) {
        int arr[]={1,3,6,4,7,0,3,7,90,6,7};
        System.out.println(new MenuTree().biggestNum(arr,arr.length-1));
        
        new MenuTree().getClass().getClassLoader().getParent();
    }
    public int biggestNum(int []arr,int index){
        //先递归结束条件
        if(index == 0){
            //一个元素最大的就是自己
            return arr[0];
        }
        if(index <0){
            //没有元素对于就是0
            return 0;
        }
        //中间的数
        int m = biggestNum(arr, index - 1);
        int tail = biggestNum(arr, index);
        //头加尾的数和
        int tailF = tail+arr[index-2];
        //对于每个index都返回最大的
        return Math.max(m,tailF);
    }
}
