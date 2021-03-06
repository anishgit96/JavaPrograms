import java.util.Scanner;

public class StringRemoveSpecificChar {

    public static void main(String[] args) {
        String originalstring = "Java Is Java";
        System.out.println("Please enter unwanted characters as String");
        Scanner in = new Scanner(System.in);
        String removecharacterstring = in.nextLine();
        String output = removeSpecificChars(originalstring, removecharacterstring);
        System.out.print("Output is >>  "+output);
    }

    public static String removeSpecificChars(String originalstring ,String removecharacterstring)
    {
        char[] orgchararray=originalstring.toCharArray();
        char[] removechararray=removecharacterstring.toCharArray();
        int start,end=0;

        //tempBoolean automatically initialized to false ,size 128 assumes ASCII
        boolean[]  tempBoolean = new boolean[128];

        //Set flags for the character to be removed
        for(start=0;start < removechararray.length;++start)
        {
            tempBoolean[removechararray[start]]=true;
        }

        //loop through all characters ,copying only if they are flagged to false
        for(start=0;start < orgchararray.length;++start)
        {
            if(!tempBoolean[orgchararray[start]])
            {
                orgchararray[end++]=orgchararray[start];
            }
        }
        return new String(orgchararray,0,end);
    }
}