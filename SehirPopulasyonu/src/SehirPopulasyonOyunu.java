
import java.util.Scanner;

public class SehirPopulasyonOyunu {

    Scanner input = new Scanner(System.in);
    int nufus;
    String[][] kisi = new String[100][2];
    String[][] ozellikler = new String[100][6];

    public static void main(String[] args) {
        SehirPopulasyonOyunu x = new SehirPopulasyonOyunu();
        x.calis();

    }

    public void calis() {
        System.out.print("Sehir nufusu: ");
        nufus = input.nextInt();
        kisi_olustur();
        System.out.println();
        while(true){
        islemler();
        System.out.print("secim yapiniz: ");
        int secim = input.nextInt();
        System.out.println();
        switch(secim){
            case 1:
                kisi_bastir();
                break;
            case 2:
                ozellikler_bastir(); 
                break;
            case 3:
                System.out.print("ozelliklerinin basilmasini istediginiz kisi: ");
                int x = input.nextInt();
                System.out.println(kisi[x-1][0]);
                System.out.println("cinsiyeti: " + ozellikler[x-1][0]);
                System.out.println("yasi: " + ozellikler[x-1][1]);
                System.out.println("meslegi: " + ozellikler[x-1][2]);
                System.out.println("sac rengi: " + ozellikler[x-1][3]);
                System.out.println("goz rengi: " + ozellikler[x-1][4]);
                System.out.println("dogdugu yer: " + ozellikler[x-1][5]);
                break;
        }
        System.out.println();
        }
        
    }

    public void kisi_olustur() {
        for (int i = 0; i < nufus; i++) {

            String DNA = "";
            for (int j = 0; j < 120; j++) {
                int x = (int) (Math.random() * 4);
                switch (x) {
                    case 0:
                        DNA += "A";
                        break;
                    case 1:
                        DNA += "T";
                        break;
                    case 2:
                        DNA += "G";
                        break;
                    case 3:
                        DNA += "S";
                        break;
                }
                kisi[i][1] = DNA;
                kisi[i][0] = "Kisi " + (i + 1) + ": ";
            }
        }
        ozellikler();
    }

    public void kisi_bastir() {
        for (int i = 0; i < nufus; i++) {
            System.out.println(kisi[i][0] + kisi[i][1]);
        }
    }

    public void cinsiyet() {     //0

        for (int i = 0; i < nufus; i++) {
            int sayi = (int) (Math.random() * 2);
            if (sayi == 0) {
                ozellikler[i][0] = "erkek";
            } else if (sayi == 1) {
                ozellikler[i][0] = "kadin";
            }
        }
    }

    public void yas() {     //1
        for (int i = 0; i < nufus; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            ozellikler[i][1] = sayi + "";
        }
    }

    public void meslek() {    //2
        for (int i = 0; i < nufus; i++) {
            int sayi = (int) (Math.random() * 10);
            switch (sayi) {

                case 0:
                    ozellikler[i][2] = "ogretmen";
                    break;
                case 1:
                    ozellikler[i][2] = "bilgisayar muhendisi";
                    break;
                case 2:
                    ozellikler[i][2] = "mimar";
                    break;
                case 3:
                    ozellikler[i][2] = "doktor";
                    break;
                case 4:
                    ozellikler[i][2] = "dis hekimi";
                    break;
                case 5:
                    ozellikler[i][2] = "eczaci";
                    break;
                case 6:
                    ozellikler[i][2] = "insaat calisani";
                    break;
                case 7:
                    ozellikler[i][2] = "kasiyer";
                    break;
                case 8:
                    ozellikler[i][2] = "ciftci";
                    break;
                case 9:
                    ozellikler[i][2] = "issiz";
                    break;
            }
        }

    }

    public void sac_rengi() {     //3

        for (int i = 0; i < nufus; i++) {
            int x = (int) (Math.random() * 4);
            switch (x) {
                case 0:
                    ozellikler[i][3] = "siyah";
                    break;
                case 1:
                    ozellikler[i][3] = "kahverengi";
                    break;
                case 2:
                    ozellikler[i][3] = "sari";
                    break;
                case 3:

                    ozellikler[i][3] = "kizil";
                    break;
            }
        }
    }

    public void goz_rengi() {      //4
        for (int i = 0; i < nufus; i++) {
            int x = (int) (Math.random() * 5);
            switch (x) {
                case 0:
                    ozellikler[i][4] = "siyah";
                    break;
                case 1:
                    ozellikler[i][4] = "kahverengi";
                    break;
                case 2:
                    ozellikler[i][4] = "mavi";
                    break;
                case 3:
                    ozellikler[i][4] = "yesil";
                    break;
                case 4:
                    ozellikler[i][4] = "ela";
                    break;
            }
        }
    }

    public void dogdugu_yer() {       //5
        for (int i = 0; i < nufus; i++) {
            int x = (int) (Math.random() * 13);
            switch (x) {
                case 0:
                    ozellikler[i][5] = "istanbul";
                    break;
                case 1:
                    ozellikler[i][5] = "ankara";
                    break;
                case 2:
                    ozellikler[i][5] = "izmir";
                    break;
                case 3:
                    ozellikler[i][5] = "kars";
                    break;
                case 4:
                    ozellikler[i][5] = "trabzon";
                    break;
                case 5:
                    ozellikler[i][5] = "sakarya";
                    break;
                case 6:
                    ozellikler[i][5] = "manisa";
                    break;
                case 7:
                    ozellikler[i][5] = "denizli";
                    break;
                case 8:
                    ozellikler[i][5] = "antalya";
                    break;
                case 9:
                    ozellikler[i][5] = "hatay";
                    break;
                case 10:
                    ozellikler[i][5] = "edirne";
                    break;
                case 11:
                    ozellikler[i][5] = "diyarbakır";
                    break;
                case 12:
                    ozellikler[i][5] = "gaziantep";
                    break;

            }
        }
    }

    public void ozellikler() {
        cinsiyet();
        yas();
        meslek();
        sac_rengi();
        goz_rengi();
        dogdugu_yer();
    }

    public void ozellikler_bastir() {
        for (int i = 0; i < nufus; i++) {
            System.out.println(kisi[i][0] + "");
            System.out.println("cinsiyet: " + ozellikler[i][0]);
            System.out.println("yas: " + ozellikler[i][1]);
            System.out.println("meslek: " + ozellikler[i][2]);
            System.out.println("sac rengi: " + ozellikler[i][3]);
            System.out.println("goz rengi: " + ozellikler[i][4]);
            System.out.println("dogdugu yer: " + ozellikler[i][5]);
            System.out.println();
        }

    }
    
    
    public void islemler(){
        
    System.out.println("1 - kisileri bastir");
    System.out.println("2 - tum ozellikleriyle kisileri bastir");
    System.out.println("3 - ozellikleri tek tek sorgula");
    
    }

}
