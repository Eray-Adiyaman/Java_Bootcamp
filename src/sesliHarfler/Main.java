package sesliHarfler;

public class Main {
    public static void main(String[] args) {

        char harf ='k';
        String[] kalınHarfler= {"A","I","0","U"};
        String[] inceHarfler ={"E","İ","Ö","Ö"};

       for(int i=0;i<4;i++){
           if (Character.toLowerCase(harf) == kalınHarfler[i].toLowerCase().charAt(i)){
               System.out.println("Kalın sesli harf");
               return;
           } else if (Character.toLowerCase(harf) == inceHarfler[i].toLowerCase().charAt(i)) {
               System.out.println("ince sesli harf");
               return;
           }else {
               System.out.println("yanlıs harf ");
               return;
           }
       }

    }
}
