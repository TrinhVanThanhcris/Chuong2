/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangthuc;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class MangThuc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap so phan tu mang so thuc la: ");
            int n = sc.nextInt();
            if(n<=0){
                throw new BatLoi("Khong the am va phai lon hon 0");
            }
            float[]a=new float[n];
            for(int i=0;i<n;i++){
                System.out.print("Phan tu thu " + i + " la: ");
                float k = sc.nextFloat();
                a[i]=k;
            }
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]+" ");
            float sum=0;
            for(int i=0;i<a.length;i++){
                sum+=a[i];
            }
            System.out.println("Tong gia tri cac phan tu trong mang la: " + sum);
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
}
