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
public class num5_ass {

    public void no5() {
        System.out.println();
        System.out.println("Answer 5");
        String x = "PACALDO";
        String y = "DO";
        System.out.println("The given string is: " + x);
        System.out.println("The given mask string is: " + y);
        char arr[] = new char[x.length()];
        char[] mask = new char[256];
        for (int i = 0; i < y.length(); i++) {
            mask[y.charAt(i)]++;
        }
        System.out.print("The new string is: ");
        for (int i = 0; i < x.length(); i++) {
            if (mask[x.charAt(i)] == 0) {
                System.out.print(x.charAt(i));
            }
        }
        System.out.println();
    }
}
