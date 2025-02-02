package pe.ld.ventas.util;

import java.util.HashMap;
import java.util.Map;

public class Session {

	private static Map<String,Object> datos;

	static {
				datos = new HashMap<String,Object>();
	}
	
	/**
	 * Constructor privado para que no se puedan crear objetos
	 */
	private Session() {
	}
	
	public static Object get(String key) {
		return datos.get(key);
	}
	
	public static void put(String key, Object value){
		datos.put(key, value);
	}
}
