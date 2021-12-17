public class TestStaticMethod {
    public static void main(String[] args) {
         StudentTH.change(); //calling change method
        
        //creating objects
        StudentTH s1 = new StudentTH(111, "Hoang");
        StudentTH s2 = new StudentTH(222, "Khanh");
        StudentTH s3 = new StudentTH(333, "Nam");
        
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
