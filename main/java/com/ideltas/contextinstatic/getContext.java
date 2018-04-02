package com.ideltas.contextinstatic;
import android.app.Application;
import android.content.Context;

public class getContext extends Application
{
    private static Context context;
    public void onCreate()
    {
        super.onCreate();
        context     =   getApplicationContext();
    }

    public static Context getCustomAppContext()
    {
        return context;
    }
}
