/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tongcacsole;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class TongCacSoLe {
    public static void main(String[] args){
        int sum = 0;
        try {
            for (int i = 1; i <= 100; i += 2) {
                sum += i;
            }
            System.out.println("Tong cac so le tu 1 den 100 la: " + sum);
        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        }
    }
}
        
    
    

