/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timso;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class TimSo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap vao mot so bat ki co 3 chu so la: ");
            double n = sc.nextDouble();
            if(n<100 || n>=1000){
                throw new BatL("So can nhap phai lon hon 100");
            }
            
            for(int i=100; i<=n; i++){
                if(i==(i/100)*(i/100)*(i/100)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10)){
                    System.out.println("So do la " + i);   
                }          
            }
        }
        catch(BatL e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
                    
                   
    
