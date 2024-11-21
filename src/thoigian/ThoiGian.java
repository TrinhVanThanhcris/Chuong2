/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thoigian;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class ThoiGian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap so gio la: ");
            float gio = sc.nextFloat();
            if(gio<0){
                throw new BatLoi("So gio khong the am");
            }
            System.out.print("Nhap so phut la: ");
            float phut = sc.nextFloat();
            if(phut<0){
                throw new BatLoi("So phut khong the am");
            }
            System.out.print("Nhap so giay la: ");
            long giay = sc.nextLong();
            if(giay<0){
                throw new BatLoi("So giay khong the am");
            }
            System.out.println("Doi gio sang giay " + (gio*3600));
            System.out.println("Doi phut sang giay " + (phut*60));
        } 
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
   }  
}
