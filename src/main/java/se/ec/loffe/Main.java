package se.ec.loffe;

// Author teacher ErikSvensson76

public class Main {

    public static void main(String[] args) {

        String source = "Tell me somethin', girl\n" +
                "Are you happy in this modern world?\n" +
                "Or do you need more?\n" +
                "Is there somethin' else you're searchin' for?\n" +
                "\n" +
                "I'm falling\n" +
                "In all the good times I find myself\n" +
                "Longin' for change\n" +
                "And in the bad times I fear myself\n" +
                "\n" +
                "Tell me something, boy\n" +
                "Aren't you tired tryin' to fill that void?\n" +
                "Or do you need more?\n" +
                "Ain't it hard keeping it so hardcore?\n" +
                "\n" +
                "I'm falling\n" +
                "In all the good times I find myself\n" +
                "Longing for change\n" +
                "And in the bad times I fear myself\n" +
                "\n" +
                "I'm off the deep end, watch as I dive in\n" +
                "I'll never meet the ground\n" +
                "Crash through the surface, where they can't hurt us\n" +
                "We're far from the shallow now\n" +
                "\n" +
                "In the shallow, shallow\n" +
                "In the shallow, shallow\n" +
                "In the shallow, shallow\n" +
                "We're far from the shallow now\n" +
                "\n" +
                "Oh, oh, oh, oh\n" +
                "Whoah!\n" +
                "\n" +
                "I'm off the deep end, watch as I dive in\n" +
                "I'll never meet the ground\n" +
                "Crash through the surface, where they can't hurt us\n" +
                "We're far from the shallow now\n" +
                "\n" +
                "In the shallow, shallow\n" +
                "In the shallow, shallow\n" +
                "In the shallow, shallow\n" +
                "We're far from the shallow now";

        String realLyrics = Rot13Converter.convertString(source);
        System.out.println(realLyrics);

        System.out.println("\n\n");

        String orcish = Rot13Converter.convertString(realLyrics);
        System.out.println(orcish);
    }
}
