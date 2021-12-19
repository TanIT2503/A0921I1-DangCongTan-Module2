package ss6_inheritance_in_java.bai_tap;

public class Point3D extends Point2D {
    private float z=0.0f;


    public Point3D(){}

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z=z;
    }

    public float[] getXYZ(){
        float[] get={this.getX(), this.getY()};
        return get;
    }

    public String toString(){
        return "(" + this.getX() + ","+this.getY() + ","+this.getZ() + ")";
    }
}
