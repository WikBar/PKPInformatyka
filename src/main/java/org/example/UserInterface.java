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
//quotes is a history of previous quotes of Kayne West

    private HashSet<String> quotes=new HashSet<>();
//Constructor of UserInterface

    public UserInterface(Scanner scan) {
        this.scan = scan;
    }
    // UserInterface method to start user interface
    public void start(){

        boolean repeat = false;
        String line;
        try{
// if an user will write next to scanner method program will print a next quote of Kayne West
// if that quote was printed before program will repeat to the time to find unique one
            while(repeat || scan.nextLine().equalsIgnoreCase("next") ) {
// refreshing each quote is processed by opening and closing a InputStream
                URL url =new URL("https://api.kanye.rest/");
                InputStream is = url.openStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(is));


                while ((line = bufferedReader.readLine()) != null) {

                    JSONObject object = new JSONObject(line);
//if quote is not in Quotes HashSet is printed and added to collection
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
