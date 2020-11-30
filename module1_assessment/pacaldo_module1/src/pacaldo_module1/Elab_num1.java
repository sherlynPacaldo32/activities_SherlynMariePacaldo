/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacaldo_module1;

/**
 *
 * @author PACALDO
 */
public class Elab_num1 {

    public void charat() {
        System.out.println();
        System.out.println("ANSWER 1");
        System.out.println("charAt()");
        String name = "PACALDO";
        char x = name.charAt(2);
        System.out.println(x);
        System.out.println(name.contains("PACALDO"));
        System.out.println(name.contains("pacaldo"));
        System.out.println();
    }

    public void indexof() {
        System.out.println();
        System.out.println("indexOf()");
        String x = "PACALDO";
        System.out.println("String Content is " + x);
        int a = x.indexOf("C");
        System.out.println("index C is " + a);
        int b = x.indexOf("D");
        System.out.println("index D is " + b);
        System.out.println();
    }
}
