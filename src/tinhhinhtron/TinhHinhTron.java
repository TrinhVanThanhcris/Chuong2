/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhhinhtron;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class TinhHinhTron {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap ban kinh hinh tron la: ");
            float bk = sc.nextFloat();
            if(bk<=0){
                throw new BatLoi("Ban kinh hinh tron phai lon hon 0");
            }
            float a = (float) (Math.PI*bk*2);
            float b = (float) (Math.PI*bk*bk);
            System.out.println("Chu vi ban kinh hinh tron la: " + a);
            System.out.println("Dien tich hinh tron la: " + b);
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
                
    }   
}
