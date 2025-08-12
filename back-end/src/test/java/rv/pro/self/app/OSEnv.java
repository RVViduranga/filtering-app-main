package rv.pro.self.app;

import java.util.Map;
import java.util.Set;

public class OSEnv {
    public static void main(String[] args) {
        Map<String, String> osEnv = System.getenv();
        String path = osEnv.get("PATH");
        System.out.println(path);

        Set<String> names = osEnv.keySet();
        for (String name : names) {
            System.out.printf("%s: %s \n", name, osEnv.get(name));
        }
    }
}
