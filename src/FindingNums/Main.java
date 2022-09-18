package FindingNums;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,9,0};
        int findnum = 5;
        boolean searchRes= false;

        for(int num : numbers){
            if(findnum== num){
                searchRes=true;
                break;
            }
        }

        if(searchRes){
            System.out.println("this number exists in an array");
        }else {
            System.out.println("this number does not exist in an array");
        }


    }
}
