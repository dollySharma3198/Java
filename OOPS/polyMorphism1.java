class Shape
{
    float height;
    float width;
    float length;
    Shape()
    {
        System.out.println("no Shape can be Built");
    }
    Shape(float l)
    {
        System.out.println("it can be a line");
        length=l;
    }
    Shape(float dolly,float w)
    {
        System.out.println("it can be a 2D shape");
        height=dolly;
        width=w;
    }
    Shape(float h,float w,float l)
    {
        System.out.println("it can be a 3D shape of float");
        height=h;
        width=w;
        length=l;
    }
    Shape(float h,float w,double l)
    {
        System.out.println("it can be a 3D shape of double ");
        height=h;
        width=w;
        length=(float)l;
    }
    Shape(float h,float w,char l)
    {
        System.out.println("Testing fxn");
        height=h;
        width=w;
        length=(float)l;
    }
    void show()
    {
        System.out.println("Height :"+height);
        System.out.println("Width :"+width);
        System.out.println("Length :"+length);
    }
}


public class polyMorphism1 
{
    public static void main(String[] args) {
        
        //Poly-Many
        //Morphs-Forms
        //when an entity acts differently at different different situation this phenomena is called polymorphism

        //1.static polymorphism
        //    overloading

        System.out.println('C');
        Shape n=new Shape();
        Shape line=new Shape(45.6f);
        Shape tri= new Shape(12.5f, 3.9f);
        Shape cone=new Shape(23,56,89);
        Shape cone2=new Shape(23,56,'A');
        cone2.show();
        n.show();
        line.show();
        tri.show();
        cone.show();

        Shape t1=new Shape(34.5f,12.6f,25.9d);

    }
}







