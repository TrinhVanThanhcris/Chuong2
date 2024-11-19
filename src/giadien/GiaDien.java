/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giadien;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class GiaDien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double giaTien=0;
        try{
            System.out.println("Nhap so dien da tieu thu cua mot ho gia dinh la: ");
            double sDien = sc.nextDouble();
            if(sDien<=0){
                throw new BatLoi("So dien tieu thu phai lon hon 0 ");
            }
            else if(sDien >=0 && sDien<=50 ){
                giaTien=sDien*1484;
                System.out.println("Gia tien la: " + giaTien);  
            }
            else if(sDien>=51 && sDien<=100){
                giaTien= 50*1484 + (sDien-500)*1533;
                System.out.println("Gia tien la: " + giaTien);
            }
            else if(sDien>=101 && sDien<=200){
                giaTien= 50*1484 + (100-50)*1533 + (sDien-100)*1786;
                System.out.println("Gia tien la: " + giaTien);
            }
            else if(sDien>=201){
                giaTien=50*1484 + (100-50)*1533 + (200-100)*1786 + (sDien-100)*2242;
                System.out.println("Gia tien la: " + giaTien);
            }
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi" + e.getMessage());
        }
        
    }
    
}
