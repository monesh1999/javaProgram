package practice;

public class RemoveUnwantedBrackets {

    public static void main(String[] args) {
        String input = "((abc)((de))";
        String result = removeUnwantedBrackets(input);
        System.out.println("INPUT  : " + input);
        System.out.println("OUTPUT : " + result);
    }

    public static String removeUnwantedBrackets(String str) {
        char[] chars = str.toCharArray();   // original input
        char[] temp = new char[chars.length]; // store valid characters
        int openCount = 0;   // track how many '(' are open
        int index = 0;       // position in temp

        // Step 1: Process characters (remove unwanted ')')
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (ch == '(') {
                openCount++;
                temp[index++] = ch;
            } 
            else if (ch == ')') {
                if (openCount > 0) {   // only keep if we had an opening
                    temp[index++] = ch;
                    openCount--;
                }
            } 
            else {
                temp[index++] = ch;    // keep letters
            }
        }

        // Step 2: Remove extra '(' from end
        char[] result = new char[index]; 
        int pos = result.length - 1;

        for (int i = index - 1; i >= 0; i--) {
            if (temp[i] == '(' && openCount > 0) {
                openCount--;  // skip this extra '('
            } else {
                result[pos--] = temp[i];  // copy valid characters
            }
        }

        // Convert char[] to String
        return new String(result);
    }
}
