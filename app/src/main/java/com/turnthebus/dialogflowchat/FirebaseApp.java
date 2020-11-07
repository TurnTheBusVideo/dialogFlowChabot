package com.turnthebus.dialogflowchat;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Turn The Bus.
 */
public class FirebaseApp extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
