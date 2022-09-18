package StringsDemo;

public class Main {
    public static void main(String[] args) {
        String message= "Nice weather today";
        System.out.println(message);

        System.out.println("String length " + message.length());
        System.out.println("Char at 6th position: " + message.charAt(5));
        System.out.println(message.concat("!"));
        System.out.println(message.startsWith("n"));
        System.out.println(message.endsWith("y"));
        char[] chars = new char[7];
        message.getChars(0,6,chars,0);
        System.out.println(chars);
        System.out.println(message.indexOf('e'));
        System.out.println(message.lastIndexOf('e'));
        System.out.println("--------------------------------");

        String newMessage = message.replace(" ","-");
        System.out.println(newMessage);

        System.out.println(message.substring(5,12));
        System.out.println(message.substring(5));

        for (String words: message.split(" ")){
            System.out.println("split "+words);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim());


    }
}
