package com.pluralsight;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.regex.Pattern;



public class Product
{
    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("src/main/resources/products.csv");
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(" \"src/main/resources/employees.csv\"");
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            HashMap<Product> searchInventory = new HashMap<String, String>();


            String input = "";
            while ((input = bufReader.readLine()) != null) {
                if (input.equals("SKU")) {
                    continue;
                }

                String[] lineSplit = input.split(Pattern.quote("|"));
                String SKU = lineSplit[0];
                String Product_Name = lineSplit[];
                Double
                String Department  =
                employees[count++] = new employee(lineSplit[1], Double.parseDouble(lineSplit[2]), Double.parseDouble(lineSplit[3]), Integer.parseInt(lineSplit[0]));
            }




        }
        catch(Exception e)
            {
                e.printStackTrace();
            }


    }


}
