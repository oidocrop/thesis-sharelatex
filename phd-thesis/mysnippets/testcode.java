package org.sid.example;
public class MyClass {
	public String callGetDeviceId(TelephonyManager tm){     	
		String imei = tm.getDeviceId();     	
		return imei; 	
	}
}
