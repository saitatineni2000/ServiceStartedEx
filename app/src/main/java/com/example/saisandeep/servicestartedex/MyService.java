package com.example.saisandeep.servicestartedex;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by saisandeep on 3/24/2015.
 */
public class MyService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"Service is created",Toast.LENGTH_SHORT).show();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service is started",Toast.LENGTH_SHORT).show();

        String data;
        data=intent.getStringExtra("message");

        Toast.makeText(this,"The displayed message is "+data,Toast.LENGTH_SHORT).show();

        //stopSelf(); //used to destroy the service on its own
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Service is destroyed",Toast.LENGTH_SHORT).show();
    }
}
