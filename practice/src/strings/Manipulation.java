package strings;

import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by user on 04.03.2016.
 */
public class Manipulation
{
    protected PrintStream stream;

    public Manipulation()
    {
        stream = System.out;
    }

    public String getCombinedStrings()
    {
        String first = "first";
        String appended = first + " second";
        first = first.substring(2);

        return first + " - " + appended;
    }

    public boolean getEqualString()
    {
        String one = "something";
        String two = "Something";

        return one.equalsIgnoreCase(two);
    }

    public int getCompareString()
    {
        String firstName = "Leonardo";
        String lastName = "Cserny";

        return firstName.compareTo(lastName);
    }

    public int getSearchedString()
    {
        String firstName = "Leonardo Cserny";
        String lastName = "Cserny";

        return firstName.indexOf(lastName);
    }

    public void printReadString()
    {
        String something = "This is a string";
        StringReader reader = new StringReader(something);
        int current;
        char[] currentChar;
        for (int i = 0; i < something.length(); i++) {
            try {
                current = reader.read();
                currentChar = Character.toChars(current);
                stream.println(currentChar);
            } catch (IOException e) { e.printStackTrace(); }
        }
    }

    public void printReversedString()
    {
        String letters = "ABCDEF";
        StringBuilder lettersProc = new StringBuilder(letters);
        stream.println(lettersProc.reverse().toString());
    }

    public void printReversedWords()
    {
        String example = "Reverse these words";
        Stack<String> stack = new Stack<String>();
        StringTokenizer tokenizer = new StringTokenizer(example);

        while (tokenizer.hasMoreTokens()) {
            stack.add((String) tokenizer.nextElement());
        }

        StringBuilder reverser = new StringBuilder();
        while (!stack.empty()) {
            reverser.append(stack.pop());
            reverser.append(" ");
        }

        stream.println(reverser.toString());
    }
}
