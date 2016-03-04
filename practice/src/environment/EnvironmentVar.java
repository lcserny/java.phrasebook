package environment;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by user on 04.03.2016.
 */
public class EnvironmentVar
{
    protected static final String KEY = "PATH";

    public String getEnvPath()
    {
        System.setProperty(KEY, "Something");
        return System.getProperty(KEY);
    }

    public void printPropertyNames()
    {
        Properties properties = System.getProperties();
        Enumeration propertyNames = properties.propertyNames();
        String key;
        while (propertyNames.hasMoreElements()) {
            key = (String) propertyNames.nextElement();
            System.out.println("KEY: " + key + ", PROP: " + properties.getProperty(key));
        }
    }
}
