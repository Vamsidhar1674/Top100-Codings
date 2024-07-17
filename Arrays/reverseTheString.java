public class reverseTheString{
    public static void main(String[] args) {
        String org="Hello World";
        String rev=reverseString(org);


        System.out.println(org);
        System.out.println(rev);
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}