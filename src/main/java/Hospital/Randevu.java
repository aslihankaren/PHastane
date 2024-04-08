package Hospital;

import java.util.*;

public class Randevu extends Doctors{
    static Scanner scan=new Scanner(System.in);
    Doctors doctor= new Doctors();

    static Map<String,String> bransMenu=new HashMap<>();

    public static void doktorListe() {
        bransMenu.put("1 ","Agiz ve dis sagligi ");
        bransMenu.put("2 ","Beslenme ve Diyet   ");
        bransMenu.put("3 ","Dahiliye            ");
        bransMenu.put("4 ","Dermatoloji         ");
        bransMenu.put("5 ","Cocuk Birimi        ");
        bransMenu.put("6 ","Göz Hastaliklari    ");
        bransMenu.put("7 ","Diyabet             ");
        bransMenu.put("8 ","Fizik Tedavi        ");
        bransMenu.put("9 ","Genel Cerrahi       ");
        bransMenu.put("10","Kulak Burun Bogaz   ");

    }


    public static void bransMenu() {
        String secim="";

        System.out.println("randevu almak istediginiz birimi seciniz \n"+
                "\t 1.  Agiz ve dis sagligi \n"+
                "\t 2.  Beslenme ve Diyet   \n"+
                "\t 3.  Dahiliye            \n"+
                "\t 4.  Dermatoloji         \n"+
                "\t 5.  Cocuk Birimi        \n"+
                "\t 6.  Göz Hastaliklari    \n"+
                "\t 7.  Diyabet             \n"+
                "\t 8.  Fizik Tedavi        \n"+
                "\t 9.  Genel Cerrahi       \n"+
                "\t 10. Kulak Burun Bogaz   \n");


        do{


            secim=scan.nextLine();
            switch (secim){
                case"1" :  //Agiz ve dis sagligi
                  agizVeDisSagligi();
                  if (secim.equals("1")){
                      System.out.println(Doctors.doctorsMap.getOrDefault("Agiz ve dis sagligi ","Hakan   "));
                      System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                      String tarih = scan.nextLine();

                      System.out.print("Randevu Saati: ");
                      String saat = scan.nextLine();

                      System.out.print("Randevu Konusu: ");
                      String konu = scan.nextLine();

                      System.out.println("\nRandevu Oluşturuldu:");
                      System.out.println("Tarih: " + tarih);
                      System.out.println("Saat: " + saat);
                      System.out.println("Konu: " + konu);
                  }else {
                      System.out.println("Baska doktor yok");
                  }
                    break;
                case"2":  //Beslenme ve Diyet
                    beslenmeVeDiyet();
                    if (secim.equals("2")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Beslenme ve Diyet ","Aysegül "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }
                    break;
                case"3":  //Dahiliye
                    dahiliye();
                    if (secim.equals("3")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Dahiliye ","Gökhan  "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }
                    break;
                case"4":  //Dermatoloji
                    dermatoloji();
                    if (secim.equals("4")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Dermatoloji  ","Sadiye  "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }

                    break;
                case"5":   //Cocuk Birimi
                    cocukBirimi();
                    if (secim.equals("5")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Cocuk Birimi ","Münevver"));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }
                    break;
                case"6":   //Göz Hastaliklari
                    gozHastaliklari();
                    if (secim.equals("6")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Göz Hastaliklari  ","Aslihan "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }

                    break;
                case"7":  //Diyabet
                    diyabet();
                    if (secim.equals("7")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Diyabet ","Ahmet   "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }
                    break;
                case"8":  //Fizik Tedavi
                    fizikTedavi();
                    if (secim.equals("8")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Fizik Tedavi   ","Talha   "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }
                    break;
                case"9":  //Genel Cerrahi
                    genelCerrahi();
                    if (secim.equals("9")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Genel Cerrahi ","Feyyaz  "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }
                    break;
                case"10": //Kulak Burun Bogaz
                    kulakBurunBogaz();
                    if (secim.equals("10")){
                        System.out.println(Doctors.doctorsMap.getOrDefault("Kulak Burun Bogaz  ","Osman   "));
                        System.out.print("Randevu Tarihi (Gun-Ay-Yil): ");
                        String tarih = scan.nextLine();

                        System.out.print("Randevu Saati: ");
                        String saat = scan.nextLine();

                        System.out.print("Randevu Konusu: ");
                        String konu = scan.nextLine();

                        System.out.println("\nRandevu Oluşturuldu:");
                        System.out.println("Tarih: " + tarih);
                        System.out.println("Saat: " + saat);
                        System.out.println("Konu: " + konu);
                    }else {
                        System.out.println("Baska doktor yok");
                    }
                    break;
                case"11": //cikis
                    break;
                default:
                    System.out.println("lütfen gecerli bir tercih yapiniz");
            }


        }while (!secim.equals("11"));
        DataBase.projeBitir();

    }

    public static void agizVeDisSagligi() {
        Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
        System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                "\t zaten bir doktorumuz var");
    }


    public static void beslenmeVeDiyet () {
        Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
        System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                "\t zaten bir doktorumuz var");

    }



        public static void dahiliye () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                               "\t zaten bir doktorumuz var");
        }

        public static void dermatoloji () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                    "\t zaten bir doktorumuz var");
        }

        public static void cocukBirimi () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                    "\t zaten bir doktorumuz var");
        }

        public static void gozHastaliklari () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                    "\t zaten bir doktorumuz var");
        }
        public static void diyabet () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                    "\t zaten bir doktorumuz var");
        }

        public static void fizikTedavi () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                    "\t zaten bir doktorumuz var");
        }
        public static void genelCerrahi () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                    "\t zaten bir doktorumuz var");

        }

        public static void kulakBurunBogaz () {
            Set<Map.Entry<String, String>> branshMenuEntrySet = bransMenu.entrySet();
            System.out.println("Randevu almak istediginiz doktoru seciniz\n" +
                    "\t zaten bir doktorumuz var");
        }



    }


