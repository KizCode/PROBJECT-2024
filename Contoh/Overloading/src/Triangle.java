class TwoDShape {
    private double width;
    private double height;

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void setWidth(double w){
        width = w;
    }

    void setHeight(double h){
        height = h;
    }

    void showDim(){
        System.out.println("Width and Height are "+ width + "and" + height);
    }

}

public class Triangle extends TwoDShape { 
    String style;

    double area(){
        return getWidth() * getHeight()/2;
    }

    void showStyle(){
        System.out.println("Triangel is "+style);
    }
    
}