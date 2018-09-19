package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
     private String name;
     private String id;
     private String group;
     private String email;
    
    // TODO: khai báo các phương thức getter, setter cho Student
     public void setName(String name){
        this.name = name;
     }
     public String getName(){
        return name;
     }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
         return group;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    /**
     * Constructor 1
     */
   public Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    public Student(Student s) {
        // TODO:
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
        
    }

    public String getInfo() {
        // TODO:
        return "Ten: " + name + "\n" + "Ma so SV: " + id + "\n" + "Lop: " + group + "\n" + "Email: " + email;
      //  return null; // xóa dòng này sau khi cài đặt
    }
}
