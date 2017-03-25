package com.dadazc;
import java.util.*;
public class Test {
   Car cars[]={new Coach("宝马",2,1000),new Coach("奔驰",4,500),
		   new Truck("东风",1000,500),new Truck("长城",1200,600),
		   new Pickup("江铃",500,2,700),};
   int Count;
   int day;
   int sum;
   Car[] rent=new Car[100];
   static Scanner input=new Scanner(System.in);
   public static void main(String[] args) {
   Test show=new Test();
   System.out.println("欢迎使用达达租车系统！");
   System.out.println("请问：您是否需要租车，1 是，0 否。");
   int a=input.nextInt();
   if(a==0){
	   input.close();
	   System.exit(-1);
   }
   System.out.println("租车信息");
   System.out.println("1.宝马 , 载客 2人, 1000元/天");
   System.out.println("2.奔驰, 载客4人, 500元/天");
   System.out.println("3.东风, 载重1000t, 500元/天");
   System.out.println("4.长城, 载客1200t, 600元/天");
   System.out.println("5.江铃, 载重700t, 载客2人,700元/天");
   System.out.println("请输入您要租车的数量：");
   int rentNum=input.nextInt();
   for(int i=0;i<rentNum;i++){
       System.out.println("您要租的第"+(i+1)+"辆车的序号");
       int x = input.nextInt();
       while(x<1||x>6){
           System.out.println("您输入的数据有问题，请重新输入");
           int y = input.nextInt();
           x=y;
       }
       int p = show.cars[x-1].price;
       show.sum +=p;
               show.rent[i] = show.cars[x-1];
   }
   System.out.println("您要租车的天数：");
   int c = input.nextInt();

   show.sum*=c;
   System.out.println("您的租车账单");
   int loadAmount =0;
   int passengerAmount =0;
   for(int i=0;i<rentNum;i++){

   System.out.print(show.rent[i].name+" ");
   loadAmount+=show.rent[i].load;
   passengerAmount+=show.rent[i].busload;
   }
   System.out.println();
   System.out.println("您的租车载人数量"+passengerAmount+"人");
   System.out.println("您的租车载货量"+loadAmount+"吨");
   System.out.println("您的租车总费用："+show.sum);
}
}
