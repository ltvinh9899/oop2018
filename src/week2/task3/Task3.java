package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Teacher{
    Teacher[] teachers = new Teacher[100];
    private String name;
    private String sex;
    private String subject;
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getSubject(){
        return subject;
    }
    public void Teacher(String name, String sex, String subject){
        this.name = name;
        this.sex = sex;
        this.subject = subject;
    }
    public void getInfo(){
        System.out.println("Ten: " + name);
        System.out.println("Gioi tinh: " + sex);
        System.out.println("Mon hoc:" + subject);
    }
    // in ra thông tin của tất cả các giáo viên.
    public boolean sameSubject(Teacher teacher){
        if(this.subject.equals(teacher.subject))
            return true;
        else
            return false;
    }
    // kiểm tra xem các giáo viên dạy cùng môn học.
    public void manGroup(){
        System.out.println("Danh sach thay giao nam: ");
        for(int i=0; i<teachers.length; i++){
            if("nam".equals(teachers[i].sex))
                System.out.println(teachers[i].name);
        }
    }
    // in ra danh sách các giáo viên nam.
}
class Dog{
    private String name;
    private String sex;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public Dog(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void getInfo(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + sex);
    }
    // in ra thông tin chó.
    public boolean checkDog(){
        if(age <= 3)
            return true;
        else
            return false;
    }
    // kiểm tra xem cho nào dưới 3 tuổi (dưới 3 tuổi cần tiêm phòng).
    public void ageDog(){
        if(age <=3)
            System.out.println("Cho con");
        if(age > 3 && age <= 10)
            System.out.println("Cho truong thanh");
        if(age > 10)
            System.out.println("Cho gia");
    }
    // phân loại chó theo độ tuổi.
}
class Movie{
    private String name;
    private String kind; // thể loại phim.
    private int time; // thời lượng bộ phim.
    public void setName(String name){
        this.name = name;
    }
    public void setKind(String kind){
        this.kind = kind;
    }
    public void setTime(int time){
        this.time = time;
    }
    public String getName(){
        return name;
    }
    public String getKind(){
        return kind;
    }
    public int getTime(){
        return time;
    }
    public Movie(String name, int time, String kind){
        this.name = name;
        this.kind = kind;
        this.time = time;
    }
    public void getInfo(){
       System.out.println("Ten: " + name);
       System.out.println("The loai: " + kind);
       System.out.println("Thoi luong: " + time);
    }
    public void checkKindMovie(){
        if("kinh di".equals(kind) || "18+".equals(kind) || "ma".equals(kind))
            System.out.println("Cam tre em duoi 18 tuoi");
    }
    public void checkTimeMovie(){
        if(time > 150)
            System.out.println("Phim can phai cat ngan");
        else
            System.out.println("Phim khong can cat ngan");
    }
}