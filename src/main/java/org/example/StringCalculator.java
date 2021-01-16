package org.example;

public class StringCalculator {

    public int add(String value){
        if (value.isEmpty())
        {
            return 0;

        }


        String[] entries = value.split(",");
        int result = 0;
        for (String entry : entries) {
            result += Integer.parseInt(entry);
        }
        return result;
    }
}
