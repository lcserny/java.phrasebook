package strings;

/**
 * Created by user on 04.03.2016.
 */
public class ManipulationMain
{
    public static void main(String[] args)
    {
        Manipulation manipulation = new Manipulation();

        System.out.println(manipulation.getCombinedStrings());
        System.out.println(manipulation.getEqualString());
        System.out.println(manipulation.getCompareString());
        System.out.println(manipulation.getSearchedString());

        manipulation.printReadString();
        manipulation.printReversedString();
        manipulation.printReversedWords();
    }
}
