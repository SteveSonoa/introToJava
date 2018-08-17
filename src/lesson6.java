public class lesson6 {
    public static void main(String[] args) {
        char simpleCharacter = 'y';
        char simpleAscii = 65;

        System.out.println(simpleAscii);

        String sampleString = "This is a string.";
        System.out.println(sampleString);

        int a = 1;
        String a1 = "" + a;
        String a2 = "The number is " + a;

        System.out.println(sampleString.charAt(2));
        System.out.println(sampleString.substring(3,9));
        System.out.println(sampleString.length());
        System.out.println(sampleString.equals("This is false"));
        System.out.println(sampleString.replaceAll(" is", " is not"));
        System.out.println(sampleString.replaceAll(" is", " is really not").replaceAll("a string", "a boolean"));
    }
}
