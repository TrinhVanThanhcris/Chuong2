package xeploaisv;
import java.util.Scanner;
public class XepLoaiSV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap diem cua sinh vien do la: ");
            float diem = sc.nextFloat();
            if(diem>100 || diem < 0){
                throw new BatLoi("Diem phai nam trong khoang tu 0 den 100");
            }
            if(diem >=90 && diem <=100){
                System.out.println("Sinh vien do xep loai: " + 'A');
            }
            else if(diem >=80 && diem <=90){
                System.out.println("Sinh vien do xep loai: " + 'B');
            }
            else if(diem >=70 && diem <=80){
                System.out.println("Sinh vien do xep loai: " + 'C');
            }
            else if(diem >=50 && diem <=70){
                System.out.println("Sinh vien do xep loai: " + 'D');
            }
            else
                System.out.println("Sinh vien do xep loai: " + 'F');      
        }
        catch(BatLoi e){
            System.out.println("Loi: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    } 
}
