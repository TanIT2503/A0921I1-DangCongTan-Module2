package ss14_java_exception.bai_tap;

public class Triangle {
    private int c1;
    private int c2;
    private int c3;

    public Triangle(int c1, int c2, int c3) throws IllegalTriangleException {
        if (c1 > 0 && c2 > 0 && c3 > 0) {
           this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3; 
        }
        else {
            throw new IllegalTriangleException("Cạnh không được nhập số âm");
        }
    }

    @Override
    public String toString() {
        return "Triangle [c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + "]";
    }
    
}
