package rv.pro.self.app;

import java.util.Properties;
import java.util.Set;

public class JVMEnv {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Set<Object> names = properties.keySet();
        for (Object name : names) {
            System.out.printf("%s: %s \n", name, properties.get(name));
        }
    }
}
