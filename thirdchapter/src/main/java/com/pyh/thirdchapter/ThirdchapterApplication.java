package com.pyh.thirdchapter;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}
