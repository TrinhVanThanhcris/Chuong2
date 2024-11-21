/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyento;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class NguyenTo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            if(n<0){
                throw new BatLoi("n phai khong am");
            }
            boolean f = true;
            for(int i=2;i<= Math.sqrt(n);i++){
                if(n%i==0){
                    f=false;
                    break;
                }
            }
            if(f){
                System.out.println("Day la so nguyen to");            
            }
            else
                System.out.println("Day khong la so nguyen to");  
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
             
    }
    
}
