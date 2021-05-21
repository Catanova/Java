class Subs {

    public static void main(String[] args) {
	// write your code here
       
        byte a= 101;
        short b= 3232;
        int c= 219999999;
        long v= 3220000000000000L;
        float g= 3.14F;
        double s= 6.54455339394934943;
        char d= 66;
        char e='B';
        String myString = "I am waiting.";
        String myString2= "new friend";
        //combining string 
        String add = myString + ' '+ myString2;
          
        double value = 4.353;
        int fromDouble_ToInt = (int) value;



        System.out.println("Hello world.");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(v);
        System.out.println(g);
        System.out.println(s);
        System.out.println(d);
        System.out.println(e);
        System.out.println(myString);
        System.out.println(myString2);
        System.out.println(add);
        System.out.println(fromDouble_ToInt);

        String a1= Byte.toString(a);
        String b1= Short.toString(a);
        String c1= Integer.toString(c);
        String v1= Byte.toString(a);
        String g1= Byte.toString(a);
        String s1= Byte.toString(a);
        
        System.out.println(a1);

    }
}
