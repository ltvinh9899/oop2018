package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
     int numerator;
     int denominator;
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }
  /*  public Fraction(){
        this.numerator = 5;
        this.denominator = 7;
    }

   /* public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public int getNumerator(){
        return this.numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public int getDenominator(){
        return this.denominator;
    }*/
    public  int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == b)
            return a;
        else {
            if(a>b)
                a = a - b;
            else
                b = b - a;
            return gcd(a,b);
        }
    }
    public void rutGon(){
        int i = gcd(this.numerator,this.denominator);
        this.numerator = this.numerator/i;
        this.denominator = this.denominator/i;
    }
    public  Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
       int a = this.numerator*other.denominator + other.numerator*this.denominator;
       int b = this.denominator*other.denominator;
       Fraction KQ = new Fraction(a,b);
        KQ.rutGon();
       return KQ;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int a =  this.numerator * other.denominator - other.numerator * this.denominator;
        int b = this.denominator * other.denominator;
        Fraction KQ = new Fraction(a,b);
        if(a != 0)
         KQ.rutGon();
        return KQ;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int a =  this.numerator *  other.numerator;
        int b = this.denominator * other.denominator;
        Fraction KQ = new Fraction(a,b);
        KQ.rutGon();
        return KQ;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int a = this.numerator * other.denominator;
        int b = this.denominator * other.numerator;
        Fraction KQ = new Fraction(a, b);
        KQ.rutGon();
        return KQ;
    }
    public  boolean equals(Fraction other){
        int a =  this.numerator * other.denominator - other.numerator * this.denominator;
        if(a == 0)
            return true;
        else
            return false;
   }
    public void inKQ(){
        if(numerator == 0)
            System.out.println("0");
        else if(denominator == 1)
            System.out.println(numerator);
        else
            System.out.println( numerator + "/" + denominator);
    }
    public  static void main(String[] args){
       // Fraction PS = new Fraction(5,10);
        Fraction PS1 = new Fraction(1,2);
        Fraction PS2 = new Fraction(2,4);
        Fraction KQ1 = PS1.add(PS2); // cộng hai phân số.
        Fraction KQ2 = PS1.subtract(PS2); // trừ hai phân số.
        Fraction KQ3 = PS1.multiply(PS2); // nhân hai phân số.
        Fraction KQ4 = PS1.divide(PS2); // chia hai phân số.

        System.out.print("cong hai phan so: ");
        KQ1.inKQ();
        // in KQ cộng hai phan so.
        System.out.print("tru hai phan so: ");
        KQ2.inKQ();
        // in KQ tru hai phan so.
        System.out.print("nhan hai phan so: ");
        KQ3.inKQ();
        // in KQ nhan hai phan so.
        System.out.print("chia hai phan so: ");
        KQ4.inKQ();
        // in KQ chia hai phan so.
        if(PS1.equals(PS2))
            System.out.println("hai phan so bang nhau");
        else
            System.out.println("hai phan so khong bang nhau");

    }
}
