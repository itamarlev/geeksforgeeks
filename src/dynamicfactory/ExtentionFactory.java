package dynamicfactory;

import java.lang.reflect.InvocationTargetException;

public class ExtentionFactory {

	private ExtentionFactory() {
	}

	public static AbstractExtension create(String extension) {
		try {
			Class c = Class.forName(
					"dynamicfactory." + extension.substring(0, 1).toUpperCase() + extension.substring(1).toLowerCase());
			return (AbstractExtension) c.getConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static AbstractExtension createFromClassName(String className) {
		Class c;
		try {
			c = Class.forName(className);
			return (AbstractExtension) c.getConstructor().newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
