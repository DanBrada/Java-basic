import java.util.Scanner;

public class App{
    public static void main(String[] args){

        //vstupy
        int a=5,b=3,c=8;

        //největší ze zadaných číslicí
        int nejvetsi = Math.max(a, Math.max(b, c));
        System.out.println(nejvetsi);

        //L - Úk. 1
        int x=  Math.min(Math.abs(a), Math.min(Math.abs(b), Math.abs(c))); //určí číslo Nejblíže nule
        System.out.println("Výsledky jsou: Nejblíže nule je "+x+", "); //napíše ho


        //L - Úk. 2
        int cisliceA1 = a%10, cisliceA2 = cisliceA1%10; //uloží do proměnných čísla na pozicích desítek a jednotek
        int cisliceB1 = b%10, cisliceB2 = cisliceB1%10;
        int cisliceC1 = c%10, cisliceC2 = cisliceC1%10;
        if((cisliceA1 != cisliceA2) && (cisliceB1 != cisliceB2) && (cisliceC1 != cisliceC2) System.out.println(""); //napíše, pokud jsou různé číslice na pozicích deítek a jednotek

        //L - Úk. 3
        int roz1 = a-b; int roz3 = b-a; int roz5 = c-a; //uloží rúzné rozdíly do proměnných
        int roz2 = a-c; int roz4=  b-c; int roz6 = c-b;
        int nejrozdil = Math.max(roz1, Math.max(roz2, Math.max(roz3, Math.max(roz4, Math.max(roz5, roz6))))); //vypíše největší rozdíl

        //L - úk.4
        int nejmensiCisA = a%10, nejmensiCisB = b%10, nejmensiCisC = c%10; //uloží jednotky
        if(a%nejmensiCisA == 0|| b%nejmensiCisB == 0||nejmensiCisC == 0) System.out.println("Alespoň jedno číslo je dělitelné svojí poslední číslicí");

        //Edovo řešení
        if(a%100 != b%100 && a%100 != c%100 && b%100 != c%100 && b%100 != a%100 && c%100 != a%100 && c%100 != b%100);

        //ze zadání k - podle Filipa
       if((a+b+c)<0){
           //do stuff...
       }else if((a+b+c)==0){
           //do another..
       }else if(a+b+c >0){
           //different...
       }


       switch((int)Math.signum(a+b+c)){
           case -1: //je záporné
                break;
           case 0; //je nula
                break;
           case 1: //je záporné
                break;
       }

       //do budoucna
       for(int i=0; i<5; i++){ //opakuje se dokud nenastane podmínka, daná prostředním blokem
           System.out.println(1);
       }

       while(a==5){ //opakuje se dokud platí
           System.out.println("a je pořád 5 :)");
       }

    }
}
//atom://teletype/portal/e8e97e32-49d8-4f9d-96b5-8f42ccff953d
 /*
        &&         ||       ^^
00       0          0         0
01       0          1         1
10       0          1         1
11       1          1         0
 */

//Scratch: https://scrach.mit.edu
//Hour of code: https://code.org ---podpora js;
