public class Child
{
    String name="G Pavan Shanmukha Madhav";
    int rollno=22049;
    int age=19;
    String gender="Male";
     
    public static void main(String[] args)
    {
        Parent p1=new Parent();
        System.out.println("Parent Details");
        System.out.println(p1.fname);
        System.out.println(p1.fgender);
        System.out.println(p1.fage);
        System.out.println(p1.mname);
        System.out.println(p1.mgender);
        System.out.println(p1.mage);
        System.out.println("Student Details");
        Child c1=new Child();
        System.out.println(c1.name);
        System.out.println(c1.rollno);
        System.out.println(c1.gender);
        System.out.println(c1.age);
        
    }
}
