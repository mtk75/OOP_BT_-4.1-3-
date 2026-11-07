public class p3d extends p2d {
    private float z = 0.0f;
    public p3d (float x,float y,float z){
        super (x,y);
        this.z = z;
    }
    public p3d(){
        super ();
        this.z = 0.0f;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};

    }
    public String toString(){
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }

}