package practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./config.properties");
        Properties pro = new Properties();
        pro.load(fis);
        System.out.println(pro.getProperty("access_token"));
        System.out.println(pro.getProperty("browser"));
        System.out.println(pro.getProperty("url"));
        System.out.println(pro.size());

	}

}
