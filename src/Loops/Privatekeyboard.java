package Loops;
class Students{
    String name;
    private int rno = 65;
    double cgpa;
    void print(){
        System.out.println(name+" "+cgpa+" "+rno);
    }
}

public class Privatekeyboard {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.print();
        s1.name = "sakshi";
        s1.cgpa = 8.2;
    }
}
