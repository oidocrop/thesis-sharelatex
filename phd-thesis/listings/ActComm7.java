public class OutFlowActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	[...]
		TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		//source
		String imei = telephonyManager.getDeviceId(); 
		InFlowActivity act = new InFlowActivity();
		Intent i = new Intent(this, act.getClass());
        //string encryption
		i.putExtra(f.e("AyHSV==S"), imei);
        //startActivity() called with reflection
		e.i(f.e("IdksmY=?A"), this, i);
	}
}