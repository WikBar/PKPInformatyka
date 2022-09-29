package org.example;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scan;
    private HashSet<String> quotes=new HashSet<>();

    public UserInterface(Scanner scan) {
        this.scan = scan;
    }
    public void start(){
        boolean repeat = false;
        String line;
        try{

            while(repeat || scan.nextLine().equalsIgnoreCase("next") ) {

                URL url =new URL("https://api.kanye.rest/");
                InputStream is = url.openStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(is));


                while ((line = bufferedReader.readLine()) != null) {

                    JSONObject object = new JSONObject(line);

                    if(!quotes.contains((String)object.get("quote"))) {
                        System.out.println(object.get("quote"));
                        quotes.add((String)object.get("quote"));
                        repeat=false;
                    }else {
                        repeat = true;
                    }
                }
                is.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
