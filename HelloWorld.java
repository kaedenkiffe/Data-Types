
/**
 * Apcsp
 *
 * @author (Kaeden)
 * @version (9/14/22)
 */
public class HelloWorld
{

    int a=5;
    int b=-2;
    int c=1;
    int d=-8;

    public void run() {
        int i=0;
        while (i < 15) {
            System.out.println("i is " +i+ " but is less than 15");
            i++;
        }
        int k=10;
        while (k > 5) {
            System.out.println("k is " +k+ " but is greater than 5");
            k=k-1;
        }
        while (a < 10&&b <= 20) {
            System.out.println("a and b is " +a+ "and" +b+ " but is less than 10 and 20");
            a=a+1;
            b=b+1;
        }
    }

    public static void main(String[] args)
    { 
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}