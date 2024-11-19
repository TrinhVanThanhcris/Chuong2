/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giamgia;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class GiamGia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap don gia cho san pham la: ");
            double dg = sc.nextDouble();
            System.out.print("Nhap phan tram giam gia la: ");
            double pt = sc.nextFloat();
            if(dg<0 || pt <0){
                throw new BatLoi("Don gia va phan tram khong bao gio am");
            }
            double giaTien = dg-dg*pt/100.00;
            System.out.println("Gia ban sau khi giam la: " + giaTien);          
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
