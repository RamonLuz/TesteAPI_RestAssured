package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties props = new Properties();

    static {
        try {
            InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config/config.properties");

            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar config.properties");
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}