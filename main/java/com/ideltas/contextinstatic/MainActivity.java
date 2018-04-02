package com.ideltas.contextinstatic;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        Random rand                         = new Random();
        int ida                             = rand.nextInt(200000);
        String url                          = String.format("http://www.ideltas.com/demo/contextInStatic.php?ida=%s", ida);
        String textView                     = "";
        new AsyncWeb(textView).execute(url);
  }

  public static class AsyncWeb extends AsyncTask<String, Void, String>
  {
    public AsyncWeb(String textView) {}

    @Override
    protected String doInBackground(String... strings)
    {
        String demoJson                     = "UNDEFINED";
        try
        {
            URL url                         = new URL(strings[0]);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream stream              = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader   = new BufferedReader(new InputStreamReader(stream));
            StringBuilder builder           = new StringBuilder();
            String inputString;
            while ((inputString = bufferedReader.readLine()) != null)
            {
                builder.append(inputString);
            }
            JSONObject topLevel             = new JSONObject(builder.toString());
            JSONObject main                 = topLevel.getJSONObject("main");
            demoJson                        = String.valueOf(main.getString("temp"));
            urlConnection.disconnect();
        }
        catch (IOException | JSONException e) {         e.printStackTrace();        }
        return demoJson;
    }

    @Override
    protected void onPostExecute(String temp)
    {
      String kMYFILE                        = "tempFile";
      Toast.makeText(getContext.getCustomAppContext(), "message before file creation", Toast.LENGTH_SHORT).show();
      createFile.save(temp, getContext.getCustomAppContext(), kMYFILE);
      String kmsg                           = readFile.read(getContext.getCustomAppContext(), kMYFILE);
      Toast.makeText(getContext.getCustomAppContext(), "from cloud"+kmsg, Toast.LENGTH_SHORT).show();
    }
  }
}
