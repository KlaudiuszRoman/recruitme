package org.example;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Api {

    public static Movie getMovie(String title, String year) {
        Movie output = null;
        try {
            URL url = new URL("http://www.omdbapi.com/?t=" + title + "&y=" + year + "&apikey=7728549c");
            InputStream is = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(is)
            );

            String line = null;
            if ((line = bufferedReader.readLine()) != null) {
                JSONObject jsonObject = new JSONObject(line);
                output = new  Movie(
                        jsonObject.getString("Title"),
                        jsonObject.getString("Plot"),
                        jsonObject.getString("Genre"),
                        jsonObject.getString("Director"),
                        jsonObject.getString("Poster")
                );
                System.out.println(jsonObject.getString("Title"));
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
}