public class StringToCharacterArray {
    public static void main(String[] args) {
        String strOrig = "Hello World";
        char[] StringArray;

        StringArray = strOrig.toCharArray();
        for(int index =0; index<StringArray.length;index++){
            System.out.print(StringArray[index]);
        }
    }
}
