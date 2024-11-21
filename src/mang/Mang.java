/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Mang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap so phan tu cua mang: ");
            int n = sc.nextInt();
            if(n<=0){
                throw new BatLoi("so phan tu cua mang phai lơn hon 0");
            }
            int[] a = new int[n];
            for(int i=0; i<n;i++){
                System.out.print("Gia tri phan tu thu " + i + " la: ");
                int k = sc.nextInt();
                a[i]=k;
            }
            for(int i=0; i<a.length; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
}
