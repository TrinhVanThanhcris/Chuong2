/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diemtienganh;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class DiemTiengAnh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap vao so luong mang chua diem tieng anh cua sinh vien la: ");
            int n = sc.nextInt();
            if(n<=0){
                throw new BatLoi("Khong the am ma phai lon hon 0");
            }
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                System.out.print("Diem cua sinh vien thu " + (i+1) +" la: ");
                a[i]=sc.nextInt();
            }
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]+ " ");
            System.out.println();
            System.out.println("Nhap vao mot diem bat ki de tim sinh vien bang diem vua nhap la: ");
            int k = sc.nextInt();
            for(int i=0;i<a.length;i++){
                if(a[i]==k){
                    System.out.println("Sinh vien thu " +(i+1)+ " co so diem bang so diem vua nhap tu ban hinh");
                    break;
                }
                else{
                    System.out.println("Khong ton tai sinh vien do");                    
                }
            }        
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
}
