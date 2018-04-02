package com.ideltas.contextinstatic;
import android.content.Context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.content.Context.MODE_PRIVATE;

public class createFile
{
    public static void save(String temp, Context ctx, String nameFile)
    {
        FileOutputStream fos1;
        try
        {
           fos1 = ctx.openFileOutput(nameFile, MODE_PRIVATE);
           fos1.write(temp.getBytes());
           fos1.close();
        }
        catch (FileNotFoundException e)  {    e.printStackTrace();   }
        catch(IOException e)             {    e.printStackTrace();   }
    }
}