/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpraktikum;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class LatihanPraktikum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double r=0;
        System.out.println("Masukan Jari-jari Bola : ");
        r=scn.nextDouble();
        hitung(r);
        
        
    }
    public static void hitung(double r){
        double L=0,pi=3.14;
        L=4*pi*r*r;
                System.out.println("Luasn permukaanya adalah : "+L);
    }
}