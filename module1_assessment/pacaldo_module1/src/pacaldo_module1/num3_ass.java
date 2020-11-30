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
public class num3_ass {

    public void no3() {
        System.out.println();
        System.out.println("Answer 3");
        int[] numbers = new int[]{23, 45, 23, 65, 34, 76, 12};
        double add = 0;
        for (int i = 0; i < numbers.length; i++) {
            add = add + numbers[i];
        }
        double ave = add / numbers.length;
        System.out.println("Average : " + ave);

    }
}
