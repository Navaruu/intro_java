public class rkmkju {
    public static void main(String[] args) {
        int number = 10;
        long longNumber = 100;
        double doubleNumber = 1.5; 
        float floatNumber = 3.0f;

        char chartext = 'c';
        String text =  "message";
        
        System.out.println(number);
        System.out.println(longNumber);
        System.out.println(doubleNumber);
        System.out.println(floatNumber);
        System.out.println(chartext);
        System.out.println(text);

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        String msg = "hello";

        System.out.println(msg + num1);

        if(num1 > num2) {
            System.out.println("num1 > num2");
            System.out.println("num1 < num2");

        } else{
            System.out.println("num1 > num2");
            System.out.println("num1 < num2");
        }
        if (num2 !=10) {
            System.out.println(num2 != 10 );

            String text1 = "text";
            String text2 = "1234";

        if (text1.equals(text2)) {
            System.out.println("zax");
   
        }
        }
        
    int num = 2;
    switch (num){
        case 1:
        System.out.println ("Case1: Value is: " + num);
        case 2:
        System.out.println ("Case2: Value is: " + num);
        break;
        case 3:
        System.out.println ("Case3: Value is: " + num);
        break;
        

    }
    }
    
        


}