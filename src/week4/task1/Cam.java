package week4.task1;
import java.util.Scanner;

class Cam  extends HoaQua
{
  protected String loai;
  protected int gia;
 public void getInfo(){
  System.out.println(loai + ": ");
  super.getInfo();
  //System.out.println("Xuất xứ: " + xuatxu);
 }
 public void nhapThongTin(){
  Scanner sc = new Scanner(System.in);
  super.nhapThongTin();
   //System.out.print("Giá: ");
  // gia = sc.nextInt();
 }
}
