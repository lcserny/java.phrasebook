package environment;

/**
 * Created by user on 04.03.2016.
 */
public class EnvironmentVar
{
    protected static final String KEY = "PATH";

    public String getCEnvPath()
    {
        System.setProperty(KEY, "Something");
        return System.getProperty(KEY);
    }
}
