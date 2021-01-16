package org.example.OOP_basic.expection;

public class    MyExceptionCatchDemos {
    private void myExceptionCatcher(int par){
        int a = 1;
        String b = "aaa";
        if ( a == 1)
        {
            b ="ccc";
            throw  new MyException(b);
        }
        throw new MyException();
    }

    private void myExceptionPasser(int par){
        myExceptionCatcher(par);
    }

    public static void main(String[] args) {
        MyExceptionCatchDemos demos = new MyExceptionCatchDemos();

        demos.myExceptionPasser(1);

    }
}
