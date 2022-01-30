public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        //TODO
        int x = 0;
        //String s = "ysqundfruogaxcruaqhieie";
        //String s = "abc";

        for (int i = 0; i < s.length(); i++) {
            //System.out.println(i);
            //System.out.println(i + 1);
            //System.out.println(s.substring(i,i+1));

            String single_letter = s.substring(i, i + 1);

            //System.out.println(single_letter);

            //System.out.println(">>>>>>>>>>>>>");


            if(single_letter.equals("a")){
                x = x + 1;
                System.out.println(i);
            }
            else if(single_letter.equals("e")){
                x = x + 1;
                System.out.println(i);
            }
            else if(single_letter.equals("i")){
                x = x + 1;
                System.out.println(i) ;
            }
            else if(single_letter.equals("o")){
                x = x + 1;
                System.out.println(i);
            }
            else if(single_letter.equals("u")){
                x = x + 1;
                System.out.println(i);
            }

        }
        //System.out.print("students:"+ x);
        return x;
    }
    //Code you problem number two here
     static int problemTwo(String s){
        //TODO
         int x = 0;
         //String s = "ysqundfruogaxcruaqhieie";
         //String s = "bobhnfwbobeewhhobobosfhew";

         for (int i = 0; i < s.length(); i++) {
             //System.out.println(i);
             //System.out.println(i + 3);
             //System.out.println(s.substring(i,i+1));

             if(i+3 <= s.length()) {
                 String Triple_letter = s.substring(i, i + 3);

                 //System.out.println(Triple_letter);

                 //System.out.println(">>>>>>>>>>>>>");
                 if(Triple_letter.equals("bob")){
                     x=x+1;
                 }
             }
         }
         //System.out.println("The number of bob is:"+ x);
        return x;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //TODO
        //String s = "abcababdeytre";
        //String s = "abcab";
        //String s= "azcbobobegghakl";
        //String s = "abc";
        //String temp_string= "";
        //String second_char ="";
        String str_temp = "";
        String str_final = "";

        for (int i = 0; i < s.length()-1; i++) {
            //System.out.println("i:" + i);

            if (s.charAt(i) <= s.charAt(i + 1)) {

                char first_char = s.charAt(i);
                //System.out.println("The first character is:" + first_char);

                //System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
                str_temp = str_temp + first_char;
                //System.out.println("The temp string is: " + str_temp);

            }
            else {
                char second_char = s.charAt(i);
                //System.out.println("The second character is: " + second_char);
                if (str_temp.length() >= str_final.length()) {
                    str_final = str_temp + second_char;
                }
                //System.out.println("The final string is: " + str_final);
                str_temp = "";
            }
            if (str_temp.length() >= str_final.length()) {
                str_final = str_temp + s.charAt(i + 1);
                //System.out.println("The final string is: " + str_final);
            }

        }
        //System.out.println("The final string is: " + str_final);

        return str_final;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
        */
    }

}

