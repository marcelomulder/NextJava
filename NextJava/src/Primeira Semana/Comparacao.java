public class Comparacao {
    public static void main(String[] args) throws Exception {
        int x = 1500;
        int y = 223;
        int z = 300;

        if (x < y){
            if (y < z){
                System.out.printf(x + " < " + y + " < " + z); 
            }
            else if (x < z){
                System.out.printf(x + " < " + z + " < " + y); 
            }
            else{
                System.out.printf(z + " < " + x + " < " + y);
            }
        }
        else {
            if (x < z){
                System.out.printf(y + " < " + x + " < " + z); 
            }
            else if (y < z) {
                System.out.printf(y + " < " + z + " < " + x);
            }
            else {
                System.out.printf(z + " < " + y + " < " + z);
            }
        }
              
    }
    
}
