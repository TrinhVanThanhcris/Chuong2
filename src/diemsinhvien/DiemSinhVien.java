/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diemsinhvien;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class DiemSinhVien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap vao so luong mang chua diem sinh vien la: ");
            int n = sc.nextInt();
            if(n<=0){
                throw new BatLoi("Khong the am va phai lon hon 0");
            }
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                System.out.print("Diem cua sinh vien thu " + (i+1) + " la: ");
                int k = sc.nextInt();
                a[i]=k;
            }
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            //Hiển thị ra điểm cao nhât
            int maxD = a[0];
            int vt=1;
            for(int i=1; i<a.length;i++){
                if(a[i]>maxD){
                    maxD=a[i];
                    vt=i+1;
                }
                
            }
            System.out.println("Diem cao nhat la: " + maxD);
            
            System.out.println("sinh vien co diem cao nhat la thu " + vt);
            //sắp xếp
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length-i-1;j++){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            System.out.println("Mang sau khi sap xep tang dan diem cua sinh vien la");
            for(int i=0;i<a.length; i++)
                System.out.println(a[i]+" "); 
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
}
