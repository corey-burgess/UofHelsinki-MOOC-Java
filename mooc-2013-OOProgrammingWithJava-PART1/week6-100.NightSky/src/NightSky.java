import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density,20,10);
    }

    public NightSky(int width, int height) {
        this(0.1,width,height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        for(int i=0;i<width;i++){
            Random blah = new Random();
            double j = blah.nextDouble();
            if ( j < this.density){
                System.out.print("*");
                starsInLastPrint++;
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print(){
        starsInLastPrint = 0;
        for(int i=0;i<height;i++){
            printLine();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
