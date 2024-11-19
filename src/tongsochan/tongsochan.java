/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tongsochan;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class tongsochan {
    public static void main(String[] args){
        int sum = 0;
        try {
            for (int i = 2; i <= 100; i += 2) {
                sum += i;
            }
            System.out.println("Tong cac so chan tu 1 den 100 la: " + sum);
        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        }
    }
}
    
    
    

