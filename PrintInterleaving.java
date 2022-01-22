//import javax.lang.model.util.ElementScanner14;

public class PrintInterleaving {
    public static void main(String[] args){
        String str1 = "AB"; //String 1
        String str2 = "CD"; //String 2
        int ptr1 = 0; //Pointer 1 will move on first string 
        int ptr2 = 0; //Pointer 2 will move on Second string 
        printInterleavingStrings(str1, ptr1, str2, ptr2, " "); //Function Call
    }
    //Recursive Function
    public static void printInterleavingStrings(String str1, int ptr1, String str2, int ptr2, String ansStr){
        //End of String Then Print Final Output
        //Base Condition
        if(ptr1 == str1.length() && ptr2 == str2.length()){
            System.out.println(ansStr); //Print final output
        }
        //If Pointer 1 is not at the end of the String 1
        if(ptr1 < str1.length()){
            printInterleavingStrings(str1, ptr1 + 1, str2, ptr2, ansStr + str1.charAt(ptr1)); //Call same function for next index.
        }
        //If Pointer 2 is not at the end of the String 2
        if(ptr2 < str2.length()){
            printInterleavingStrings(str1, ptr1 , str2, ptr2 + 1, ansStr + str2.charAt(ptr2)); //Call same function for next index.
        }
    }
}
