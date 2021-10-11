package com.pyh.thirdchapter;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.floorMod;
import static java.lang.Math.round;

@SpringBootApplication
public class ThirdchapterApplication {

	private int i=6;

	public static void main(String[] args) {
		SpringApplication.run(ThirdchapterApplication.class, args);
	}

	@Test
	public void test()
	{
// look \u00A0 s
//		System.out.println('\u03C0');
		System.out.println(floorMod(1-10,12));
	}

	@Test
	public void test1()
	{
		double x=9.99;
		int i= (int) x;
		System.out.println(i);
	}

	enum Size{small,medium}

	@Test
	public void test2()
	{
		System.out.println(Size.small.toString());
	}

	@Test
	public void test3()
	{
		String s="pyh";
		String sub=s.substring(1,3);
		System.out.println(sub);

		String all=String.join("-","p","y","h");
		System.out.println(all);
	}

	@Test
	public void test4()
	{
		String hello="hello";
		String tmp=new String("Hello");
		System.out.println(hello.equalsIgnoreCase(tmp));
	}

	@Test
	public void test5()
	{
		StringBuilder builder=new StringBuilder();
		builder.append("p");
		builder.append("h");
		builder.insert(1,"y");
		builder.delete(1,3);
		System.out.println(builder.toString());

	}

	@Test
	public void test6()
	{
		String name="pyh";
		int age=5;
		String mes=String.format("hello,%s,you will be %d",name,age);
		System.out.println(mes);
		System.out.printf("hello,%s,you will be %d",name,age);
	}

	@Test
	public void test7()
	{
		System.out.printf("now time is:%ty-%tp",new Date(),new Date());
	}
//数组排序
	@Test
	public void test8()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("你想抽出来几个数：");
		int k=in.nextInt();
		System.out.println("这几个数的上限是多少：");
		int n=in.nextInt();

		int[] numbers=new int[n];
		for (int i=0;i<numbers.length;i++)
		{
			numbers[i]=i+1;
		}

		int[] result=new int[k];
		for (int i=0;i<result.length;i++)
		{
			int r=(int)(Math.random()*n);
			result[i]=numbers[r];

			numbers[r]=numbers[n-1];
			n--;
		}
		System.out.println("没有排序前，result数组为：");
		System.out.println(Arrays.toString(result));
		Arrays.sort(result);
		System.out.println("排序后，result数组为：");
		System.out.println(Arrays.toString(result));
	}

	@Test
	public void test9()
	{
		int[][] a={{1,2},{3,4}};
		System.out.println(Arrays.deepToString(a));
	}
}
