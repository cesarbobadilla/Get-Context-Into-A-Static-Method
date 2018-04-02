package com.ideltas.contextinstatic;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

public class readFile
{
    public static String read(Context ctx, String nameFile)
    {
        String temp                     = "";
        try
        {
            InputStream inputStream     = ctx.openFileInput(nameFile);
            if ( inputStream != null )
            {
                int c;
                while ((c = inputStream.read()) != -1)
                {
                    temp                = temp + Character.toString((char) c);
                }
            }
        }
        catch (IOException e)           {}
        return temp;
    }
}
