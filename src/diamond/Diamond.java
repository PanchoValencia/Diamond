/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond;

import java.util.Scanner;

/**
 *
 * @author JoséFrancisco
 */
public class Diamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        function fn = new function();
        
        System.out.println("Type a word: ");
        String word = in.nextLine();
        fn.createDiamond(word);
    }
    
}
