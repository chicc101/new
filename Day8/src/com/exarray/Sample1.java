package com.exarray;

class Sample1
{
    public static void main(String[] args)
    {
        int [] test; //int 형 배열 생성하겠다! 라고만 선언
    
        
        
        test = new int[5]; //5개 생성할거야
        
        test[0] = 80; 
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;
        
        for(int i=0; i<5; i++){
            test[i] = (i+1)*10;
            System.out.println(test[i]);
            
        }
    }
}
