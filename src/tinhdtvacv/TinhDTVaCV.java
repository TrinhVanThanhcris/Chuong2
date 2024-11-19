/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhdtvacv;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class TinhDTVaCV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap chieu dai hinh chu nhat la: ");
            float a = sc.nextFloat();
            System.out.print("Nhap chieu rong hinh chu nhat la: ");
            float b = sc.nextFloat();
            if(a<=0 || b<=0){
                throw new BatLoi("Chieu rong va chieu dai phai lon hon 0");
            }
            System.out.println("Chu vi hinh chu nhat la: " + (a+b)*2);
            System.out.println("Dien tich hinh chu nhat la: " + (a*b));
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());  
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }    
    }   
}
