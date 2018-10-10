package week4.task1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

 class HoaQua {
    protected String loai;
    //protected int gia;
    protected int soluong;
    public void setLoai(){
        this.loai = loai;
    }
//    public void setGia(){
//        this.gia = gia;
//    }
    public void setSoLuong(){
        this.soluong = soluong;
    }
    public String getLoai(){
        return loai;
    }
//   // protected int getGia(){
//        return gia;
//    }
    protected int getSoLuong(){
        return soluong;
    }
//    public HoaQua(String xuatXu, int gia, int soLuong){
//        this.xuatXu = xuatXu;
//        this.gia = gia;
//        this.soLuong = soLuong;
//    }
    public void getInfo(){
        System.out.println("*" + loai);
      //  System.out.println("Giá(VND/quả): " + gia);
        System.out.println("Số lượng: " + soluong);
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Loại hoa quả: ");
        loai = sc.nextLine();
      //  System.out.print("Giá(VND/quả): ");
       // gia = sc.nextInt();
        System.out.print("Số lượng: ");
        soluong = sc.nextInt();
    }
}
