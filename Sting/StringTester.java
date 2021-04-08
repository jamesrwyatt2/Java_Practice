public class StringTester{
    public static void main(String[] args) {
        StringManipulator runner = new StringManipulator();
        runner.trimAndConcat("   Hello   ","    World");
        runner.getIndexOrNull("coding", 'o');
        runner.getIndexOrNull("Running Home", 'o');
        runner.getIndexOrNull("Pizza", 'o');
        runner.getIndexOrNull("hi", 'o');

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a = runner.getIndexOrNull(word, subString);
        Integer b = runner.getIndexOrNull(word, notSubString);
        
        String word2 = runner.concatSubstring("Hello", 1, 2, "world");
    }




}