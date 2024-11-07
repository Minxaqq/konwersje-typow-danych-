import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("wprowadz liczbe:");
        double liczba = scanner.nextDouble();

        int wynik = (int) liczba;
        System.out.println("liczba całkowita= "  + wynik);
        System.out.println("                            ");
        System.out.println("podaj liczbe do obliczenia kwadratu: ");
        int liczba2 = scanner.nextInt();
        int kwadrat = liczba2 * liczba2;
        System.out.println("kwadrat liczby: "+ kwadrat);
        System.out.println("                            ");
        System.out.println("                            ");
        System.out.println("a= 5, b=12");
        int a = 5;
        int b = 12;
        int suma = a + b;
        System.out.println("wynik dodawania :"+ suma);
        System.out.println("                            ");
        int roznica = a - b;
        System.out.println("wynik odejmowania a-b: "+ roznica);
        System.out.println("                            ");
        int roznica2 = b - a;
        System.out.println("wynik odejmowana b-a: "+roznica2 );
        System.out.println("                            ");
        int iloczyn = a * b;
        System.out.println("wynik mnozenia: "+ iloczyn);
        System.out.println("                            ");
        double iloraz = (double) a / b;
        System.out.println("wynik dzielenia a/b: "+ iloraz );
        System.out.println("                            ");
        int reszta = a % b;
        System.out.println("reszta z dzielenia: "+ reszta);
        System.out.println("                            ");
        double iloraz2 = (double) b / a;
        System.out.println("wynik dzielenia b/a: "+ iloraz2);
        System.out.println("                            ");
        System.out.println("                            ");
        System.out.println("podaj pierwsza liczbe: ");
        int pierwszaliczba  = scanner.nextInt();
        System.out.println("podaj druga liczbe: ");
        int drugaliczba  = scanner.nextInt();
        double dzielenie= (double) pierwszaliczba / drugaliczba;
        System.out.println("wynik dzielenia: "+ dzielenie);
        double reszta2 = (double) pierwszaliczba % drugaliczba;
        System.out.println("reszta wynosi "+ reszta2);
        System.out.println("                            ");
        System.out.println("                            ");
        System.out.println("podaj dowolna liczbe ");
        int dowolnaLiczba = scanner.nextInt();

        if(dowolnaLiczba > 10 && dowolnaLiczba % 2 == 0){
            System.out.println("liczba jest parzysta i wieksza niz 10  ");
        }else{
            System.out.println("liczba nie spelnia warunkow");
        }
        System.out.println("                            ");
        System.out.println("                            ");
        System.out.println("poda dowolna liczbe: ");
        int dowolnaLiczba2 = scanner.nextInt();
        if(dowolnaLiczba2 < 5 ){
            System.out.println("liczba jest mniejsza niz 5");
        } else if (dowolnaLiczba2 > 15) {
            System.out.println("liczba jest wieksza niz 15");
        }else{
            System.out.println("liczba nie jest ani taka ani taka");
        }
        scanner.close();
    }
}