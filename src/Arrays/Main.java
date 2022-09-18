package Arrays;

public class Main {
    public static void main(String[] args) {

       String[] dizi = new String[3];
       dizi[0]= "eray";
       dizi[1]="erkan";
       dizi[2]="ady";

       for(int i=0;i< dizi.length;i++){
           System.out.println(dizi[i]);
       }

        System.out.println("-----------------------------");

       for(String names:dizi){
           System.out.println(names);
       }


    }
}
