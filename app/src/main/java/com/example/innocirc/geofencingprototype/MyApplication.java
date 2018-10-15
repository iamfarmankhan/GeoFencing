package com.example.innocirc.geofencingprototype;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class MyApplication extends Application {

    public static final String GEOFENCE_NOTIFICATION_CHANNEL = "geofence_channel";


    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel geofenceChannel = new NotificationChannel(
                    GEOFENCE_NOTIFICATION_CHANNEL,
                    getResources().getString(R.string.geofence_channel_name),
                    NotificationManager.IMPORTANCE_HIGH);

            geofenceChannel.setDescription("Geofence channel");
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(geofenceChannel);
        }
    }


}
