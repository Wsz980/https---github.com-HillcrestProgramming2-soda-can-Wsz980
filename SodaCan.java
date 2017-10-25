package SodaCan;

/**
 * Created by wzha1379 on 10/24/2017.
 */
public class SodaCan {
    private double surfaceArea;
    private double volume;

    public SodaCan(double height, double diameter){
        getSurfaceArea();
        findSurfaceArea(height, diameter);
        findVolume(height, diameter);
    }

    private void findSurfaceArea(double height, double diameter){
        surfaceArea = (2*(Math.PI*Math.pow(0.5*diameter, 2))+((Math.PI*diameter)*height));
    }

    private void findVolume(double height, double diameter){
        volume = ((Math.PI*Math.pow(0.5*diameter, 2))*height);
    }

    public double getSurfaceArea(){
        return surfaceArea;
    }

    public double getVolume(){
        return volume;
    }
}
