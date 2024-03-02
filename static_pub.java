public class Main{
    static void welcome()
    {
        System.out.println("WELCOME FAMILY");
    }
    public void end()
    {
        System.out.println("Bye Bye");
    }
    public static void main(String[] args)
    {
        welcome();
        Main ob=new Main();
        ob.end();
    }
}
