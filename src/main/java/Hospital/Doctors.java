package Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Doctors {
    static Scanner scan=new Scanner(System.in);

    static Map<String,String> doctorsMap=new HashMap<>();

    public static void doktorListe() {
        doctorsMap.put("Agiz ve dis sagligi ","Hakan   ");
        doctorsMap.put("Beslenme ve Diyet   ","Aysegül ");
        doctorsMap.put("Dahiliye            ","Gökhan  ");
        doctorsMap.put("Dermatoloji         ","Sadiye  ");
        doctorsMap.put("Cocuk Birimi        ","Münevver");
        doctorsMap.put("Göz Hastaliklari    ","Aslihan ");
        doctorsMap.put("Diyabet             ","Ahmet   ");
        doctorsMap.put("Fizik Tedavi        ","Talha   ");
        doctorsMap.put("Genel Cerrahi       ","Feyyaz  ");
        doctorsMap.put("Kulak Burun Bogaz   ","Osman   ");
        ;
    }

    public static void doktorMenu() throws InterruptedException {
        String secim="";
        do{

            System.out.println("              JAVA HASTANESI                \n" +
                    "\t                         Sagligin Merkezi\n" +
                    "\t 1.Doktorlarimiz \n" +
                    "\t 2.Anasayfa  \n "+
                    "\t 3.Cikis\n");
            secim=scan.nextLine();
            switch (secim){
                case"1":   //doktorlarimiz
                    doktorListesiYazdir();
                    break;
                case"2":    //anasayfa
                    DataBase.star();
                    break;
                case"3":    //cikis
                    break;
                default:
                    System.out.println("lütfen gecerli bir tercih yapiniz");
            }

        }while (!secim.equals("3"));

    }


    public static void doktorListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String,String>> doctorsEntrySet=doctorsMap.entrySet();
        System.out.println("              JAVA HASTANESI                \n" +
                "\t                         Sagligin Merkezi\n" +
                "\t   Doktorlarimiz \n"+
                "BRANS                        ISIM   ");

        for (Map.Entry<String,String> w: doctorsEntrySet){
            String wKey=w.getKey();
            String wValue=w.getValue();
            System.out.println(wKey+ "       "+ wValue);
        }
        Thread.sleep(5000);
    }

}
