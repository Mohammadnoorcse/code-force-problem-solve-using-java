
public class NewClass {
    public static void main(String[] args) {
        try{
        int a[] = new int [5];
        a[5] = 30/0;
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println(10);
        
    }
    
}
