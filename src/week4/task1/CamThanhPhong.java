package week4.task1;

import java.util.Scanner;

public class CamThanhPhong extends Cam {
    private String xuatxu;
    private String chatluong;
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Xuất xứ: " );
        xuatxu = sc.nextLine();
        System.out.print("Chất lượng(cao hoặc bình thường): " );
        chatluong = sc.nextLine();
    }

    public int dinhGia(){
        //Cam c = new Cam();
        if(chatluong.equals("cao")){
             gia= 50000;
        }
         if (chatluong.equals("bình thường")){
            gia = 30000;
        }
         return  gia;
    }
   public void getInfo(){
       // System.out.println("Cam Thanh Phong: ");
        super.getInfo();
        System.out.println("Giá(VND/kg): " + gia);
        System.out.println("Xuất xứ: " + xuatxu);
        System.out.println("Chất lượng: " + chatluong);
        if(chatluong.equals("cao"))
            System.out.println("xuất khẩu");
        if(chatluong.equals("bình thường"))
            System.out.println("không xuất khẩu");
   }

}
