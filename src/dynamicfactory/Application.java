package dynamicfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		AbstractExtension extension = ExtentionFactory.create("txt");
		extension.printSomething();

		AbstractExtension extension2 = ExtentionFactory.create("jPg");
		extension2.printSomething();
		
		Properties prop = new Properties();
		OutputStream output = null;
		InputStream input = null;

		try {
			output = new FileOutputStream("config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// set the properties value
		prop.setProperty("txt", "dynamicfactory.Txt");
		prop.setProperty("jpg", "dynamicfactory.Jpg");

		// save properties to project root folder
		try {
			prop.store(output, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			input = new FileInputStream("config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// load a properties file
		prop.load(input);

		String extensionClassName = prop.getProperty("txt");
		ExtentionFactory.createFromClassName(extensionClassName).printSomething();

		extensionClassName = prop.getProperty("jpg");
		ExtentionFactory.createFromClassName(extensionClassName).printSomething();
		

	}


}
