

public class App {
    public static void main(String[] args) throws Exception {
        int sample1[] = new int[5];
        int sample2[] = {1,2,3,4,5};
        int i;

        
        
        for(i = 0; i < 5; i++){
            sample1[i] = i;
        }
       
        for(i = 0; i < 5; i++){
            System.out.println("This is sample1[" + i + "]: " + sample1[i]);
        }
        
        for(i = 0; i < 5; i++){
            System.out.println("This is sample2[" + i + "]: " + sample2[i]);
        }

      
    }
}
