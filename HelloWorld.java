
/**
 * Apcsp
 *
 * @author (Kaeden)
 * @version (9/14/22)
 */
public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        if (a==5){
         System.out.println("Success");
    } else {
        System.out.println("Failure");    
    }
       if (b==2){
           System.out.println("Success");
    } else { 
            System.out.println("Failure");
    }
        if (c!=1){
        System.out.println("Success");
    } else {
        System.out.println("Failure");
    }
        if (d==-8 && a==4){
        System.out.println("Success");
    }else {
        System.out.println("Failure");
        }
    System.out.println("Hello World!");
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}
