/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class Inputan {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        int a, b;
        System.out.println("Masukan nilai a :");
        a = masukan.nextInt();
        System.out.println("Masukan nilai b :");
        b = masukan.nextInt();
        System.out.println("");
        System.out.println("Nilai variable yang ada pada program :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
