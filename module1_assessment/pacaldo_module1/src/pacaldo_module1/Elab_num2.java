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
public class Elab_num2 {

    public void array() {
        System.out.println();
        System.out.println("answer 2");
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("serlyn");
        names.add("mitche");
        names.add("mary");
        names.add("maria");
        names.add("danica");
        System.out.println("Array");
        System.out.println("Names are: " + names);
        String[] arrayGame = new String[names.size()];
        names.toArray(arrayGame);
        System.out.print("NAme Array are: ");
        for (String items : arrayGame) {
            System.out.print(items + ", ");
        }
        System.out.println();
        System.out.println();
    }
}
