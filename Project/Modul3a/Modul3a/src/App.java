class MyClass {
    int alpha;
    public int beta;
    private int gamma;

    void setGamma(int g) {
        this.gamma = g;
    }

    int getGamma() {
        return gamma;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MyClass ob = new MyClass();

        ob.alpha = 88;
        ob.beta = 77;
        
        ob.setGamma(10);
        int gamma = ob.getGamma();

        System.out.println("ob.alpha = " + ob.alpha);
        System.out.println("ob.beta = " + ob.beta);
        System.out.println("ob.gamma = " + gamma);
    
    }
}
