import java.util.Date;

public class opgave9komma3 {

    public static void main(String[] args) {

        //Laver Dato med java Util
        Date dato = new Date();

        //tester at det virker
        System.out.println("Current time: "+dato.toString());

        //Laver long, der bruges i loop
        long i;


        //Loopet, der printer de forskellige tider.
        for (i=10000; i<= 1e11; i=i*10){
            dato.setTime(i);
            System.out.println("Time after " + i + " have elapsed:" + dato.toString());
        }

    }


}
