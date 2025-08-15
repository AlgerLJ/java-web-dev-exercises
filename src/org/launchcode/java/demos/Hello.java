package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int aNumber = 5;
        Integer intCount1 = Integer.valueOf(aNumber);
        Integer intCount2 = Integer.valueOf(aNumber+5);
        Integer intCount3 = intCount1 + intCount2;
        System.out.println(intCount3);
        int finalNumber = (int) intCount3;
        String errorMsg = "please inform production support for issue fix";

    }
}
