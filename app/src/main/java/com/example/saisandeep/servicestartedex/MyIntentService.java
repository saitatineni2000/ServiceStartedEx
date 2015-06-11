package com.example.saisandeep.servicestartedex;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by saisandeep on 3/24/2015.
 */
public class MyIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public MyIntentService() {
        super("bhy");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service is created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service is started",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d("Sandeep", "This is handled by onHandleIntent");
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        Toast.makeText(this,"Service is destroyed",Toast.LENGTH_SHORT).show();
    }
}
