package week1;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student[] students= new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup())){
        return true;
        }
        else      
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
        int n = students.length;
        for(int i=0; i<n; i++){
            if("int22041".equals(students[i].getGroup()))
                System.out.println(students[i].getInfo());
        }
    }

    void removeStudent(String id) {
        // TODO:
        int n = students.length;
       // int k=0;
        for(int i=0; i<n; i++){
            if(id.equals(students[i].getId()) == false){
                System.out.println(students[i].getInfo());
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        Student SV1 = new Student();
        Student SV2 = new Student("Student", "000", "uet@vnu.edu.vn");
        Student SV3 = new Student(SV1);
        System.out.println(SV1.getName());
        System.out.println(SV2.getInfo());
        System.out.println(SV2.getInfo());
        StudentManagement SV = new StudentManagement();
        System.out.println("sv1 sv2 cung lop: " + SV.sameGroup(SV1,SV2));
        System.out.println("sv1 sv3 cung lop: " + SV.sameGroup(SV1,SV3));
        System.out.println("sv2 sv3 cung lop: " + SV.sameGroup(SV2,SV3));
        SV.studentsByGroup();
        SV.removeStudent("000");

    }
}
