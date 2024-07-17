public class revTheString {
    public static void main(String[] args) {
        String org="vamsi";
        String rev=reverseString(org);
            System.out.println(org);
            System.out.println(rev);
        }
        public static String reverseString(String str){
            char[] chars =str.toCharArray();
            int left=0;
            int right=chars.length-1;

            while(left<right){
                char temp =chars[left];
                chars[left]=chars[right];
                chars[right]=temp;

                left++;
                right--;
            }
            return new String(chars);
        
    }
    
}
