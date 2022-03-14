package ie.gmit.twodshapes;

public class TwoDShape {
    
    // Instance Variables
    private float widthCm;
    private float heightCm;

    // Constructor
    public TwoDShape(float widthCm, float heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    // Getters and Setters
    public float getWidthCm() {
        return this.widthCm;
    }

    public float getHeightCm(){
        return this.heightCm;
    }

    //setter
    public void setWidthCm(float widthCm) {
        this.widthCm = widthCm;
    }

    public void setHeightCm(float heightCm){
        this.heightCm = heightCm;
    }
}
