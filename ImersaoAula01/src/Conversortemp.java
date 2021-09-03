import java.text.DecimalFormat;

public class Conversortemp {
 
    public static void main(String[] args) throws Exception {
               
        float tempCelsio = 35.5f;
        float tempFarenheit = (tempCelsio * 1.8f) + 32f;
        float tempReaumr = tempCelsio * 0.8f;
        float tempRankine = (tempCelsio * 1.8f) + 32f + 459.67f;
        float tempKelvin = tempCelsio + 273.15f;

        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("Kelvin: "+ formatador.format(tempKelvin));
        System.out.println("Rankine: "+ formatador.format(tempRankine));
        System.out.println("Reaumr "+ formatador.format(tempReaumr));
        System.out.println("Farenheit: "+ formatador.format(tempFarenheit));
    }   
}
