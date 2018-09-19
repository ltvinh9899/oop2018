package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.group.equals(s2.group)){
        return true;
        }
        else      
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student student1 = new Student();
        student1.setName("Le Thanh Vinh");
        student1.setId("17021132");
        student1.setGroup("INT22041");
        student1.setEmail="17021132uet@vnu.edu.vn";
        student1.getInfo();
        Student student2 = new Student();
        student2.setName("Nguyen Van A");
        student2.setId("111");
        student2.setGroup("INT22041");
        student2.setEmail="111uet@vnu.edu.vn";
        Student student1 = new Student();
        student1.setName("Nguyen Van B");
        student1.setId("222");
        student1.setGroup("INT22042");
        student1.setEmail="222uet@vnu.edu.vn";
    }
}
