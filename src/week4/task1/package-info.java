/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
class Main{
    public static void main(String[] agrs) {
        HoaQua hq = new HoaQua();
        hq.nhapThongTin();
        hq.getInfo();

       Cam c = new Cam();
       c.nhapThongTin();
       c.getInfo();

        CamThanhPhong ctp = new CamThanhPhong();
        ctp.nhapThongTin();
        ctp.dinhGia();
        ctp.getInfo();
        CamSanh cs = new CamSanh();
        cs.nhapThongTin();
        cs.dinhGia();
        cs.getInfo();
        Tao t = new Tao();
        t.nhapThongTin();
        t.dinhGia();
        t.getInfo();
   }
}