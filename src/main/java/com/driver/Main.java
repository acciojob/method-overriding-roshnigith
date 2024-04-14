package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        String m=b.meth();
        String o=b.meth();
    }
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return  "Method is overridden in Extended class B";
        }
    }
}
