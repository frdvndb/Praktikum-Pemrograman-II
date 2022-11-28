package praktikum5.soal;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double h) 
    {
        super("Cylinder"); 
        radius = r;
        height = h;
    }
    
    public double area() 
    {
        return Math.PI*radius*radius*height;
    }
    
    public String toString() 
    {
        return super.toString() + " of Radius " + radius + " and Height " + height;
    }    
}