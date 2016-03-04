package strings;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by user on 04.03.2016.
 */
public class Manipulation
{
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
                System.out.println(currentChar);
            } catch (IOException e) { e.printStackTrace(); }
        }
    }
}
