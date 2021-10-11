package com.pyh.inherit;

import com.pyh.inherit.pojo.Employee;
import com.pyh.inherit.pojo.Manager;
import com.pyh.inherit.pojo.Person;
import com.pyh.inherit.pojo.Student;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class InheritApplication {

	public static void main(String[] args) {
		SpringApplication.run(InheritApplication.class, args);
	}

	@Test
	public void test1()
	{
		Employee employee=new Employee("员工",1,1,1,1);
		Manager manager=new Manager("员工",1,1,1,1,0);
//		manager.setBonus(2);
		System.out.println(employee.toString());
		System.out.println(manager.toString());
		System.out.println(manager.equals(employee));

	}

	@Test
	public void test2()
	{
		Employee employee=new Employee("员工",1,1,1,1);
		employee.setDescription("我是员工");
		Student student=new Student();
		student.setDescription("我是学生");

		System.out.println(employee.getDescription());
		System.out.println(student.getDescription());

		System.out.println("------抽象类-------");
		Person[] people={employee,student};
		for (Person p:people)
		{
			System.out.println(p.getDescription());
		}
	}

	@Test
	public void test3()
	{
//		不用在定义的时候确定数组列表的大小
		ArrayList<Employee> a=new ArrayList<>();
		a.add(new Employee("一"));
		a.add(new Employee("二"));
		a.add(new Employee("三"));
		System.out.println("原来的内容是："+ a.toString());
		a.remove(1);
		System.out.println("删除后的内容是："+ a.toString());
		a.add(1,new Employee("二"));
		System.out.println("添加后的内容是："+ a.toString());
		System.out.println("第二个位置的是："+a.get(1));
	}

	@Test
	public void test4()
	{
		Integer a=-129;
		Integer b=-129;
		Integer c=666;
		Integer d=666;

		System.out.println(a==b);
		System.out.println(c==d);
	}

	@Test
	public void test5()
	{
		System.out.println(Integer.valueOf("11",8));
	}

	@Test
	public void test6()
	{
		Employee employee=new Employee();
		System.out.println(employee.getClass());
	}

}
