package Hospital;

import java.util.*;

public class Hasta {
    static Scanner scanner = new Scanner(System.in);

    static Map<String, String> hastaMap = new HashMap<>();

    public static void hastaMap() {

    }

    public static void hastaGiris() {
        String tercih = "";
        do {

            System.out.println("              JAVA HASTANESI          \n" +
                    "\t                         Sagligin Merkezi\n" +
                    "\n" +
                    "\t   1- HASTA KAYIT \n" +
                    "\t   2- ÇIKIŞ \n");

            System.out.println(" ");
            tercih = scanner.nextLine();


            switch (tercih) {
                case "1": //
                    break;
                case "2":  //
                    break;

                default:
                    System.out.println("Lütfen gecerli bir islem seciniz");


            }
            while (!tercih.equals("2"));
            DataBase.projeBitir();

        }
    }
}





