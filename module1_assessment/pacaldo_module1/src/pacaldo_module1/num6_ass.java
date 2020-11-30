/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacaldo_module1;

import java.io.File;

/**
 *
 * @author PACALDO
 */
public class num6_ass {

    public void no6() {
        System.out.println();
        System.out.println("Answer 6");
        File file = new File("C:\\Users\\PACALDO\\module1_assessment\\array.txt");
        if (file.exists()) {
            System.out.println("The directory or file exists");
        } else {
            System.out.println("The directory or file does not exist");
        }

    }
}
