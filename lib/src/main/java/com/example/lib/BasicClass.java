package com.example.lib;

public class BasicClass {
    public static void main(String[] args) {//entry point of program
        //single line comment - code will not execute
        /* hash
         block comment - document, complex logic, testing purpose
        * */
        System.out.println("hello world");//java output
//sout for print
        /*
        * data-type variable=value;
        * int age=25;
        * */
        byte x=127;//x never used//number 8 bit -> -128 --> 127 - 1byte
        x=30;
        System.out.println("My age is "+x);
        short y=32767;//number 16 bit -32,768 to 32,767 - 2 byte
        int age=2147483647;//number  32 bit - 4 byte -2147483648 to 2147483647
        long w=979823479299949204L;//number- end L 64 bit - 8 byte -9223372036854775808 to 9223372036854775807
        //
        float pi=33.14F;//decimal number up to 6 or 7 - 32 bit -4 byte  add F at last
        double pi2=343.4549;//decimal number up to 15 or 16 //64 bit -8 byte higher precision (accuracy)
        //
        boolean isRaining=true; //only two value on off, true or false, yes or no
        boolean allCoinsCollected=false; //taking decision


        //char
        char myChar='d';//only one char, letter symbol or number 1 byte
        char myNumber='7';
        char mySymbol='#';
        char newLine='\n'; //escape character
        char tab='\t';//



        //type casting - process of converting a value from one data type to another
        //implicit type casting - automatically , no loss ..small to large

        int num=10;
        double num2=num;//10.0
        System.out.println("num2 "+num2);

        // explicit type casting- manually converting .large to small, data loss
        double pi3=3.14;
        int numpi= (int)pi3;//decimal part will removed
        System.out.println("numpi "+numpi);

        //type casting between different data types
        int myInt=5;
        char myChar2=(char)(myInt+'A');//F

        System.out.println("mychar2 "+myChar2);
        //
        //arithmetic + - * / % - perform math calculation
        //comparison or relational == != < > >= <=
        //logical operator && || !
        //
        System.out.println(1*2);
        //
        String name="ragu";//strings are sequence of characters -objects
        String name2="raman";
        //concatenating strings: "+"//joining//combining
        System.out.println("full name "+name +name2.length());
        System.out.println("length of "+name2+" "+name2.length());

        //conditional statements to take decisions ..condition is true..it perform specific task
        // if , if else , if   else if()   else
if(false)
{

}else if(true){

}else{

}

//switch- multiple cases difference action based on value

        int dayOfWeek=3;
        switch(dayOfWeek){
    case 1:
        System.out.println("one");break;
    case 2:
        System.out.println("two");break;
    default:
        System.out.println("default");break;
}
       // System.out.println("My age is "+numpi);

        //while - repeat as long as condition is true
        int number=1;
        while(number<5){
            System.out.println("while "+number);
            number+=1;
        }
        //for with break and continue - repeat block of code, specified number of times

        for(int i=10;i<=15;i++){

            if(i==12){
                 break;//stop the nearest loop
            }
            System.out.println(i);

        }
        System.out.println("----");

        for(int i=10;i<=15;i++){
            if(i==12){
                continue;//skips the step and go back
            }
            System.out.println(i);
        }
        System.out.println("----");
        //arrays- store multiple values in same datatype  in single variable ..element access using index
        //each elements in array associate with index
        int[] numbers=new int[5];
        //storing values in the array
        numbers[0]=2;
        numbers[1]=3;
        numbers[2]=4;
        //for(datatype element: collection) {}
        for(int ele : numbers){ //for each loop ..enhanced for loop
            System.out.println(ele);
        }


        //multidimensional array [row][column] //array of arrays //create table like structure
        // grid ,matrix ,rows and columns
        System.out.println("---");
        //2d array
        //datatype[] arrayName=new datatype[row][columns];
        int[][] myMatrix=new int[3][3]; //3 elements not 4 , 3 is number of elements

        myMatrix[0][0]=1;//first row first column
        myMatrix[0][1]=2;//first row second column
        myMatrix[0][2]=3;//first row third column

        myMatrix[1][0]=4;
        myMatrix[1][1]=5;
        myMatrix[1][2]=6;

        myMatrix[2][0]=7;
        myMatrix[2][1]=8;
        myMatrix[2][2]=9;

        System.out.println(myMatrix[2][2]);

        //multidimensional array, array of array
        int[][] myMatrix2={//2d array
                {1,2,3},//row 1
                {4,5,6},//row 2
                {7,8,9}// row 3
        };


        System.out.println(myMatrix[2][1]);


    }
}

/*
1. comments
2. main method - entry point of program
3. output statement
4. variable- box that store the data , later use
5. data types-define type of data that a variable can hold ,primitive-basic datatype,for simple data, non-primitive- reference type
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


//non primitive..objects - ex array, string, class, ..etc  first letter capital  letter- datatype..