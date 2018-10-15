package com.example.innocirc.geofencingprototype.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.example.innocirc.geofencingprototype.R;

import static com.example.innocirc.geofencingprototype.MyApplication.GEOFENCE_NOTIFICATION_CHANNEL;

public class NotificationUtils {



    public void showNotification(Context context,String msg)
    {
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        Notification notification = new NotificationCompat.Builder(context,GEOFENCE_NOTIFICATION_CHANNEL)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentText("Geofence")
                .setContentText(msg)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_EVENT)
                .build();
        notificationManager.notify(1,notification);
    }


}
