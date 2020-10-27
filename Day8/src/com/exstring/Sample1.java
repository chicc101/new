package com.exstring;

class Sample1
{
    public static void main(String[] args)
    {
        String str = "Hello";
        
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        
        int len = str.length();
        
        System.out.println(str + " 의 첫 번째 문자는 " + ch1 );
        System.out.println(str + " 의 두 번째 문자는 " + ch2 );
        System.out.println(str + "길이는 "+ len );
    }
}
