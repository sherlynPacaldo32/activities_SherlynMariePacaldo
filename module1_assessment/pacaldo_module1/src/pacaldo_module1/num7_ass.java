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
public class num7_ass {

    public void no7() {
        System.out.println();
        System.out.println("Answer 7");
        File file = new File("C:\\Users\\PACALDO\\Desktop");
        String[] files = file.list();
        for (String file_name : files) {
            System.out.println(file_name);
        }

    }
}
