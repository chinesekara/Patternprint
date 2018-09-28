/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternprint;

import java.util.Scanner;

/**
 *
 * @author huang
 */
public class PatternPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n / 2;
        int star = 1;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < space; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n / 2) {
                star += 2;
                space -= 1;
            } else {
                star -= 2;
                space += 1;

            }
        }
    }

}
