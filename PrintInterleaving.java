//import javax.lang.model.util.ElementScanner14;

public class PrintInterleaving {
    public static void main(String[] args){
        String str1 = "AB";
        String str2 = "CD";
        printInterleavingStrings(str1, 0, str2, 0, " ");
    }
    public static void printInterleavingStrings(String str1, int ptr1, String str2, int ptr2, String ansStr){
        if(ptr1 == str1.length() && ptr2 == str2.length()){
            System.out.println(ansStr);
        }
        if(ptr1 < str1.length()){
            printInterleavingStrings(str1, ptr1 + 1, str2, ptr2, ansStr + str1.charAt(ptr1));
        }
        if(ptr2 < str2.length()){
            printInterleavingStrings(str1, ptr1 , str2, ptr2 + 1, ansStr + str2.charAt(ptr2));
        }
    }
}
