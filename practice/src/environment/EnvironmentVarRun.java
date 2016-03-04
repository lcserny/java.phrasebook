package environment;

/**
 * Created by user on 04.03.2016.
 */
public class EnvironmentVarRun
{
    public static void main(String[] args)
    {
        EnvironmentVar environmentVar = new EnvironmentVar();
        String path = environmentVar.getCEnvPath();

        System.out.println(path);
    }
}
