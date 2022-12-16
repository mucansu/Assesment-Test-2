
public class Methods {

    public static int calculateSurfaceAreaOrVolumeOfCube(boolean surfaceCalculation, int width) {
        if (surfaceCalculation){
        return width*width*6;
        }
        else {
            return width*width*width;
        }
    }


    public static int sumEdges(int[] arr, boolean add10000) {
        int sums = arr[0] + arr[arr.length-1];
        return add10000 ? (sums + 10000) : sums;
    }

}
