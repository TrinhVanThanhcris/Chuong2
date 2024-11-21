/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanghi;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class NhaNghi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap don gia ban dau la: ");
            double dg = sc.nextDouble();
            if(dg<=0){
                throw new BatLoi("Don gia phai lon hon 0");
            }
            System.out.print("Nhap so ngay o la: ");
            int ngay = sc.nextInt();
            if(ngay<=0){
                throw new BatLoi("So ngay o phai lon hon 0");   
            }
            if(ngay==1){
                System.out.println("Tien phong la: " + dg);
            }
            else if(ngay>=2 && ngay <=4){
                System.out.println("Tien phong la: " + (dg-dg*0.2));
            }
            else if(ngay>=5 && ngay<=10){
                System.out.println("Tien phong la: " + (dg-dg*0.4));
            }
            else
                System.out.println("Tien phong la: " + (dg-dg*0.6));
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
}
