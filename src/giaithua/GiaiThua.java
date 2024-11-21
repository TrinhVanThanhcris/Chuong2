/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaithua;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class GiaiThua {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap n: ");
            int n = sc.nextInt();
            if(n<0){
                throw new BatLoi("Gia tri n khong the am");
            }
            int giaiThua=1;
            for(int i=2; i<=n; i++){
                giaiThua*=i;    
            }
            System.out.println("Gia tri n giai thua la: " + giaiThua );  
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
                        
    }
    
}
