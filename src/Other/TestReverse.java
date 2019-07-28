package Other;

public class TestReverse {
    public static void main(String[] args) {
        String str2 = "Hello";
        str2 = new StringBuffer(str2).reverse().toString();
        System.out.println(str2);

        String message = "Hello";
        StringBuilder rev = new StringBuilder();
        for (int i = message.length() - 1; i >= 0; i--)
            rev.append(message.charAt(i));
        System.out.println(rev.toString());

    }

}

