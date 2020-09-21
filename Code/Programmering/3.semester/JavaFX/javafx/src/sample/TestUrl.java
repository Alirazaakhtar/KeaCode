package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class TestUrl {

    private static HttpURLConnection connection;

    public static void main(String[] args) {




        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();



        try {
            URL url = new URL("https://api.exchangeratesapi.io/latest");
            try {
                connection = (HttpURLConnection)url.openConnection();

                // Request setup
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                //Reponse from server

                int status = connection.getResponseCode();
                System.out.println(status);

                if(status > 200){
                    reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                    while ((line = reader.readLine()) != null){
                        responseContent.append(line);
                    }
                    reader.close();
                }else {
                    reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    while ((line = reader.readLine()) != null){
                        responseContent.append(line);

                    }
                    reader.close();

                }




                System.out.println(responseContent.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        finally {
            connection.disconnect();
        }



    }
}
