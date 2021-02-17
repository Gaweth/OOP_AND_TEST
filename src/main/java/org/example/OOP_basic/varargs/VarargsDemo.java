package org.example.OOP_basic.varargs;

public class VarargsDemo {

    public static void main(String[] args) {
        VarargsDemo demo = new VarargsDemo();
        System.out.println(demo.sumAllPassedInts());
        System.out.println(demo.sumAllPassedInts(1));
        System.out.println(demo.sumAllPassedInts(3, 2, 1));

    }

    private int sumAllPassedInts(int... values){
        int result = 0;
        for (int value : values)
        {
            result += value;
        }


        return result;
    }

    private int sumAllPassedOneAlwaysAvaible( int oneValue, int... followingValues)
    {
        int result = oneValue;
        for (int followingValue : followingValues) {
            result  += followingValue;
        }
        return result;
    }

}
