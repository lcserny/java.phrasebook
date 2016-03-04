package environment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 04.03.2016.
 */
public class EnvironmentVarTest
{
    @Test
    public void testGetCEnvPath() throws Exception
    {
        String expected = "Something";
        String actual = new EnvironmentVar().getCEnvPath();

        assertEquals(expected, actual);
    }
}