/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waterandcomputermanufactring;
import java.util.Scanner;

/**
 *
 * @author aemal4075
 */
public class WaterAndComputerManufactring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int num1;
        double num2;
        
        double water = 1.5;
        
        System.out.println("Enter the number of computer/monitor combos you own " );
        num1 = keyedInput.nextInt();
        num2 = num1 * water;
        
        System.out.println("The total number of tons of water used to manufature them is " + num2 + " tons" + "." );
        
        // TODO code application logic here
    }
    
}
