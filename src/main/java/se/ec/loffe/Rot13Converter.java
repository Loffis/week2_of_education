package se.ec.loffe;

public class Rot13Converter
{

    public static char convertChar(char source){
        if(source > 64 && source < 78){
            return add13(source);
        }else if(source > 77 && source < 91){
            return sub13(source);
        }else if(source > 96 && source < 110){
            return add13(source);
        }else if(source > 109 && source < 123){
            return sub13(source);
        }
        return source;
    }

    private static char sub13(char source) {
        return (char) ((char) source - 13);
    }

    private static char add13(char source) {
        return (char) ((char) source + 13);
    }

    public static String convertString(String source) {
        char[] wordArray = source.toCharArray();
        for(int i = 0; i < wordArray.length; i++){
            wordArray[i] = convertChar(wordArray[i]);
        }
        return String.copyValueOf(wordArray);
    }
}
