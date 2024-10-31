public class App {
    public static void main(String[] args) throws Exception {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setWidth(4);
        t1.setHeight(4);
        t1.style = "fillred";

        t2.setWidth(8);
        t2.setHeight(12);
        t2.style = "outlined";

        System.out.println("Info for t1 ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+t1.area());

        System.out.println();

        System.out.println("Info for t2 ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+t2.area());

    }
}
