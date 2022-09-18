package MultiDimensionalArrays;

public class Main {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "İzmir";
        sehirler[1][2] = "Antalya";
        sehirler[2][0] = "Sinop";
        sehirler[2][1] = "Mersin";
        sehirler[2][2] = "Adana";


        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
