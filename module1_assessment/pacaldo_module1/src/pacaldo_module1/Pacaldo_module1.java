/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacaldo_module1;

/**
 *
 * @author jkswfoa
 */
public class Pacaldo_module1 {

    public boolean last(String str) {
        int l = str.length();
        String ng = "lyn";
        if (l < 3) {
            return false;
        } else if (ng.equals(str.substring(l - 3, l))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        num1_ass no1;
        num2_ass no2;
        num3_ass no3;
        num5_ass no5;
        num6_ass no6;
        num7_ass no7;
        Elab_num1 el_no1;
        Elab_num2 el_no2;
        no1 = new num1_ass();
        no2 = new num2_ass();
        no3 = new num3_ass();
        no5 = new num5_ass();
        no6 = new num6_ass();
        no7 = new num7_ass();
        el_no1 = new Elab_num1();
        el_no2 = new Elab_num2();

        System.out.println("-------------------ELABORATE: Coding-------------------");
        el_no1.charat();
        el_no1.indexof();
        el_no2.array();
        System.out.println("       ASSESSMENT");
        no1.no1();
        no2.no2();
        no3.no3();
        System.out.println("");
        System.out.println("Answer 4");
        Pacaldo_module1 m = new Pacaldo_module1();
        String str1 = "sherlyn";
        System.out.println("The given strings is: " + str1);
        System.out.println("The string containing lyn at last: " + m.last(str1));
        no5.no5();
        no6.no6();
        no7.no7();

    }
}
