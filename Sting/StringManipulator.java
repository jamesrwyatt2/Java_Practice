public class StringManipulator {
    public static String trimAndConcat(String String1, String String2) {
        String strnew = (String1.trim() + String2.trim());
        System.out.println(strnew);
        return strnew;
    }
    public static Integer getIndexOrNull(String String3, char letter){
        if(String3.indexOf(letter) > 0){
            Integer time = String3.indexOf(letter);
            System.out.println(time);
            return time;        
        }
        else {
            Integer time = 0;
            System.out.println(time);
            return time;
        }
    }
    public static Integer getIndexOrNull(String String4, String String5){
        if(String4.indexOf(String5) > 0){
            Integer time = String4.indexOf(String5);
            System.out.println(time);
            return time;        
        }
        else {
            Integer time = 0;
            System.out.println(time);
            return time;
        }
    }

    public static String concatSubstring(String String1, int num1, int num2, String String2){
        String temp = String1.substring(num1,num2);
        String newstr = (temp + String2);
        System.out.println(newstr);
        return newstr;
    }
}
