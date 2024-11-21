/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhietdo;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class NhietDo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap nhiet do tu ban phim la: ");
            float C = sc.nextFloat();
            if(C>=60 || C<= -100){
                throw new BatLoi("Nhiet do khong the nam trong khoang the,"
                        + " neu vay sekhong ton tai su song tren trai dat");
            }
            float F = (float) ((C*1.8)+32);
            System.out.println("Gia tri cua F la: " + F);   
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
        
               
    }
    
}
