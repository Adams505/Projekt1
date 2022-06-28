import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Witaj w kalkulatorze figur plaskich, wybierz figure:");
    System.out.println("1.Kwadrat \r\n2.Prostokąt\r\n3.Koło \r\n4.Trojkat");
    int z = scan.nextInt();

    switch (z){
      case 1:
      {
        System.out.println("Wybrales kwadrat, podaj jego bok:");
        double a = scan.nextInt();
        double pole = a*a;
        double przekatna = Math.sqrt(2)*a;
        System.out.println("Parametry:");
        System.out.println("Pole: "+pole);
        System.out.println("Przekatna: "+przekatna);
      }break;
        
      case 2:
      {
          System.out.println("Wybrales prostokat, podaj jego bok a:");
        double a = scan.nextInt();
        System.out.println("Podaj bok b:");
        double b = scan.next.Int();
        double pole = a*b;
        double przekatna = Math.sqrt((a*a)*(b*b));
        
      }break;
    }
  }
}