package Hospital;

import java.util.Scanner;

public class DataBase {

   static Scanner scan= new Scanner(System.in);

    public static void star() throws InterruptedException {
        String secim="";

        do {

        System.out.println("              JAVA HASTANESI          \n" +
                "\t                         Sagligin Merkezi\n" +
                "                ANA MENU               \n" +
                "\n" +
                "\t   1- HASTANE  BILGILERI \n" +
                "\t   2- RANDEVU ALMA \n" +
                "\t   3- DOKTORLARIMIZ \t\t \n" +
                "\t   4- ÇIKIŞ \n");

        System.out.println("Lütfen görmek istediginiz menünün sayisini giriniz");
        secim=scan.nextLine();

switch (secim){
    case "1": //Hastane bilgileri
        Hastane.HastaneBilgileriniYazdir();
        break;
    case "2":  //Randevu Alma
        Randevu.bransMenu();
        break;
    case "3":  //Doktorlarimiz
        Doctors.doktorMenu();
        break;
    case "4":  //Cikis
        break;
    default:
        System.out.println("Lütfen gecerli bir islem seciniz");
}
        }while (!secim.equals("4"));
        DataBase.projeBitir();
}

        public static void projeBitir() {
            System.out.println("iyi günler diliyoruz  \n "+
                    "\t Saglikla Kalin");
            System.exit(0);
        }
    }
