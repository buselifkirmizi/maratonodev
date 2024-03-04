
import java.util.Arrays;

public class Maraton {

        public static void main(String[] args) {
            int[] zaman = {2341, 273, 278, 329,445,402,338,270,243,334,412,393,299,343,317,265};
            String[] katilanlar = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar" , "Mehmet", "Ali" ,"Emel", "Fırat",
                              "James","Jale","Ersin","Deniz", "Gözde","Anıl","Burak"};

            String birinci = birinciKosucu(katilanlar, zaman);
            System.out.println("Maratonu 1. Bitiren Öğrenci : " + birinci);

            String ikinci = ikinciKosucu(katilanlar,zaman );
            System.out.println("Maratonu 2. Bitiren Öğrenci : " + ikinci);

            String ucuncu = ucuncuKosucu(katilanlar,zaman);
            System.out.println("Maratonu 3. Bitiren öğrenci : " + ucuncu);

            yarismacilariSiniflandir(zaman);
        }

        public static int enDusukZamanDegeri(int[] zaman) {
            int enDusukDeger = 0;
            for (int i = 1; i < zaman.length; i++) {
                if (zaman[i] < zaman[enDusukDeger]) {
                    enDusukDeger = i;
                }
            }
            return enDusukDeger;
        }

        public static String birinciKosucu(String[] katilanlar, int[] zaman) {
            int enDusukDeger = enDusukZamanDegeri(zaman);
            return katilanlar[enDusukDeger] + "   ---> " + zaman[enDusukDeger] + " dakika";
        }

    public static String ikinciKosucu(String[] katilanlar, int[] zaman) {
            int enDusukDeger = enDusukZamanDegeri(zaman);
            zaman [enDusukDeger] = Integer.MAX_VALUE;
            enDusukDeger = enDusukZamanDegeri(zaman);
            return katilanlar[enDusukDeger] + "   ---> " + zaman[enDusukDeger] + " dakika";
        }

        public static String ucuncuKosucu(String[] katilanlar, int[] zaman) {
            int enDusukDeger = enDusukZamanDegeri(zaman);
            zaman[enDusukDeger] = Integer.MAX_VALUE;
            enDusukDeger = enDusukZamanDegeri(zaman);
            zaman[enDusukDeger] = Integer.MAX_VALUE;
            enDusukDeger = enDusukZamanDegeri(zaman);
            return katilanlar[enDusukDeger] + "  ---> " + zaman[enDusukDeger] + " dakika";
        }

        public static void yarismacilariSiniflandir(int[] zaman) {
            int[] sinifSayisi = new int[3];
            Arrays.fill(sinifSayisi, 0);

            for (int i = 0; i < zaman.length; i++) {
                if ((zaman[i] >= 200) && (zaman[i] <= 299)) {
                    sinifSayisi[0]++;
                } else if (zaman[i] >= 300 && zaman[i] <= 399) {
                    sinifSayisi[1]++;
                } else {
                    sinifSayisi[2]++;
                }
            }

            System.out.println("A ---> " + sinifSayisi[0]);
            System.out.println("B ---> " + sinifSayisi[1]);
            System.out.println("C ---> " + sinifSayisi[2]);
        }
    }



