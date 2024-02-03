package com.example.lib;

import java.lang.reflect.Array;

public class MyClass {
    public static void main(String[] args) {

        byte x=127;
        short y=32767;
        int age=2147483647;
        long w=979823479299949204L;
        //
        float pi=33.14F;
        double pi2=343.4549;
        //
        Boolean isRaining=true;
        //char
        char myChar='A';
        //
        int num=10;
        double num2=num;//10.0
        //
        double pi3=3.14;
        int numpi=(int) pi3;

        //
        //arithmetic + - * / %
        //comparison relational == != < > >= <=
        //logical operator && || !
        //
        String name="ragu";
        String name2="raman";
        System.out.println("full name "+name +name2.length());
if(false)
{

}else if(true){

}else{

}

//

        int dayOfWeek=3;
switch(dayOfWeek){
    case 1:
        System.out.println("one");break;
    case 2:
        System.out.println("two");break;
    default:
        System.out.println("default");
}
       // System.out.println("My age is "+numpi);

        //while
        int number=1;
        while(number<5){
            System.out.println(number);
            number+=1;
        }
        //for with break
        for(int i=11;i<=15;i++){
            if(i==12){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("----");
        //arrays
        int[] numbers=new int[5];
        numbers[0]=2;
        numbers[1]=3;
        numbers[2]=4;
        for(int ele : numbers){
            System.out.println(ele);
        }
//multidimensional array [row][column]
        System.out.println("---");
        int[][] myMatrix=new int[3][3];

        myMatrix[0][0]=1;
        myMatrix[0][1]=2;
        myMatrix[0][2]=3;

        myMatrix[1][0]=4;
        myMatrix[1][1]=5;
        myMatrix[1][2]=6;

        myMatrix[2][0]=7;
        myMatrix[2][1]=8;
        myMatrix[2][2]=9;

        System.out.println(myMatrix[2][2]);

        //multidimensional array
        int[][] myMatrix2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(myMatrix[2][1]);


    }
}

/*
1. comments
2. main method
3. output statement
4. variable
5. data types
6. number type
7. decimal
8. char
9. type casting
10. operators
11. string
12. conditional statements
13. switch
14. while
15. for
16. break and continue(skip)
17. arrays
18. boolean
19. for each
20. multidimensional array (like table)
**/