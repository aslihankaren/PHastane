package Hospital;

public class Hastane {

static final   String hospitalName="Java Hastanesi";  //finaller degistirilmesini engellemek icin, public herkes görsün diye
static final String  adress="Sincan/Ankara";
static  final String telefon= "0 312 455 55 55";
static final String email="JavaHastanesi@gmail.com";

private  Hastane(){   //obje olusumunu engellemek icin privat yaptik

}

    public static void HastaneBilgileriniYazdir() throws InterruptedException {
        System.out.println("              JAVA HASTANESI " + "                \n"+
                "\t\t     Adres : " + Hastane.adress +
                "\n\t\t Telefon : " + Hastane.telefon +
                "\n\t\t    email: " + Hastane.email);
        Thread.sleep(5000);

    }
}
