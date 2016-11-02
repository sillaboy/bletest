package com.example.bluetooth.le;

import java.util.HashMap;

public class EyemiGattAttributes {
	 private static HashMap<String, String> attributes = new HashMap();
	 
	    
	 	public static String TI_GAP = "00001800-0000-1000-8000-00805f9b34fb";
	 	public static String TI_GATT = "00001800-0000-1000-8000-00805f9b34fb";
	    public static String UUID_CHAR6 = "0000fff6-0000-1000-8000-00805f9b34fb";
	    public static String UUID_CHAR7 = "0000fff7-0000-1000-8000-00805f9b34fb";
	    public static String UUID_CHAR8 = "0000fff8-0000-1000-8000-00805f9b34fb";
	    public static String DISTANCE_TEST = "0000fff9-0000-1000-8000-00805f9b34fb";
	    public static String UUID_CHARA = "0000fffa-0000-1000-8000-00805f9b34fb";
	    
	    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";	    

	    static {
	    	attributes.put(TI_GAP, "Generic Access Profile Service");
	    	attributes.put(TI_GATT, "Generic Access TT");	    	
	        attributes.put(DISTANCE_TEST, "Heart Rate Measurement");
	        attributes.put(UUID_CHAR8, "laala");
	        attributes.put(UUID_CHAR7, "simple");
	    }

	    public static String lookup(String uuid, String defaultName) {
	        String name = attributes.get(uuid);
	        return name == null ? defaultName : name;
	    }

}
