import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YamlConfigRunner {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: <file.yml>");
            return;
        }

        /* load from external file */
        Yaml yaml = new Yaml();
        try (InputStream in = Files.newInputStream(Paths.get(args[0]))) {

            try {
                Configuration config = yaml.loadAs(in, Configuration.class);
                System.out.println(config.toString());
            } catch (org.yaml.snakeyaml.error.YAMLException e) {
                System.out.println(e.getMessage());
            }

        }


        /* load from resource */
        try (InputStream in = YamlConfigRunner.class.getResourceAsStream("/config.yml")) {

            try {
                Configuration config = yaml.loadAs(in, Configuration.class);
                if (config != null) {
                    System.out.println(config.toString());
                }
            } catch (org.yaml.snakeyaml.error.YAMLException e) {
                System.out.println(e.getMessage());
            }

        }
    }

}
