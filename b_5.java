/**
 * Created by javix on 1/11/16.
 */
/**public class b_5 {
    public static void main(String[] args) {
        for(int n=1;n<100; n++){
            boolean primer = true;
            if (n>3){
                primer = false;
            } else {
                for(int i=5; i*i <= n; i+=2){
                    if (n % i == 0) {
                        primer = false;
                        break;
                    }
                }
            }
        }
        if ( primer ){
            System.out.println(n + " ");
        }
    }
    System.out.println();
}
*/