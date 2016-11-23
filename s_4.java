import java.util.Scanner;

/**
 * Created by javix on 10/11/16.
 */
public class s_4 {
    //1 año tiene 365 dias
    //1 dia tiene 24 horas
    //1 hora tiene 3600 segundos
    public static void main(String[] args) {
        final long MIN = 60;
        final long HOUR = MIN*60;
        final long DAY = HOUR*24;
        final long MONTH = DAY*30;
        final long YEAR = DAY*365;

        // Demanem a l'usuari el número de segons
        Scanner s = new Scanner(System.in);
        System.out.println("Dona'm els segons: ");
        long seconds = s.nextLong();

        // Anem dividint els segons entre els segons que té un any, un mes, un dia...
        // Els quocients de les divisions ens donen les unitats (anys, mesos...)
        // i els residus ens donen els segons que sobren
        long years = seconds / YEAR;
        seconds = seconds % YEAR;
        long months = seconds / MONTH;
        seconds = seconds % MONTH;
        long days = seconds / DAY;
        seconds = seconds % DAY;
        long hours = seconds / HOUR;
        seconds = seconds % HOUR;
        long mins = seconds / MIN;
        seconds = seconds % MIN;

        // Imprimim el resultat, mirant primer que no són zero
        if (years>0) System.out.println("Years: " + years);
        if (months>0) System.out.println("Months: " + months);
        if (days>0) System.out.println("Days: " + days);
        if (hours>0) System.out.println("Hours: " + hours);
        if (mins>0) System.out.println("Minutes: " + mins);
        if (seconds>0) System.out.println("Seconds: " + seconds);
    }
}
