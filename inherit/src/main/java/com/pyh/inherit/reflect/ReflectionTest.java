package com.pyh.inherit.reflect;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        String className=in.next();
        String className="com.pyh.inherit.pojo.Employee";
        try {
            Class cl=Class.forName(className);
            Class superCl=cl.getSuperclass();

            String modifiers= Modifier.toString(cl.getModifiers());
            if (modifiers.length()>0)
            {
                System.out.print(modifiers+" ");
            }
            System.out.print("class "+className);
            if (superCl!=null&&superCl!=Object.class)
            {
                System.out.print(" extends "+superCl.getName());
            }
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printFields(Class cl) {
    }

    private static void printMethods(Class cl) {
    }

    private static void printConstructors(Class cl) {
        Constructor[] constructors=cl.getDeclaredConstructors();

        for (Constructor c:constructors)
        {
            String modifiers=Modifier.toString(c.getModifiers());
            if (modifiers.length()>0)
                System.out.print(modifiers+" "+c.getName()+"(");

            Class[] paramTypes=c.getParameterTypes();
            for (int j=0;j<paramTypes.length;j++)
            {
                if (j>0)
                    System.out.print(",");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");

        }
    }
}
