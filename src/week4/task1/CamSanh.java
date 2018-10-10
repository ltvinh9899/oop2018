package week4.task1;

import java.util.Scanner;

public class CamSanh extends Cam{
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
            gia = 30000;
        }
        if (chatluong.equals("bình thường")){
            gia = 20000;
        }
        return  gia;
    }
    public void getInfo(){
       // System.out.println("Cam Sành");
        super.getInfo();
        System.out.println("Giá(VND/kg): " + dinhGia());
        System.out.println("Xuất xứ: " + xuatxu);
        System.out.println("Chất lượng: " + chatluong);
        if(chatluong.equals("cao"))
            System.out.println("xuất khẩu");
        if(chatluong.equals("bình thường"))
            System.out.println("không xuất khẩu");
    }


}
