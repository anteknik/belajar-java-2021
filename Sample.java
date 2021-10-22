import java.util.Date;


class Sample{
    public static void main(String[] args) {
    var s="ini string";
        
    var p=new Person();
    p.nama="adi";
    p.age=39;
    p.dob = new Date();
    System.out.println("hello :"+p.nama+" " +p.dob);

    }

    
}
class Person{
    String nama;
    Integer age;
    Date dob; 
}