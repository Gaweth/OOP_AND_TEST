package org.example;

public class Units {

    public char[] everyNthChar(char[] sourceArray, int n )
    {
        if(sourceArray==null || sourceArray.length < n)
        {
            return sourceArray;
        }

        int returnedLength = sourceArray.length /n;
        char[] resultArray = new char[returnedLength];
        int index = 0;

        for (int i = n-1; i < sourceArray.length; i+=n) {
            resultArray[index] = sourceArray[1];
            index++;
        }
        return  resultArray;

    }

    public String removePairs(String source) {
        if (source.length() < 2) {
            return source;
        }
        /**
         * String - wykorzstuje obszar pamiecu StringPool, nie podlega nisczeniu przez GC
         *
         *StringBuilder - wprowadzamy pozniej = do aplikacji jednowatkowych, szybszy od stroid buildera
         *
         *StringBuffer - od javy 10-
         */

        StringBuilder stringBuilder = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length - 1; i++) {
            System.out.println(string[i]);
            if (string[i] != string[i + 1]) {
                stringBuilder.append(string[i]);
            }
        }
        System.out.println(string[string.length - 1]);
        stringBuilder.append(string[string.length - 1]);

        return stringBuilder.toString();
    }
}

//garbage colector