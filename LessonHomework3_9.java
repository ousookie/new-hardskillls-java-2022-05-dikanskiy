import java.security.SecureRandom;
import java.util.Random;

public class LessonHomework3_9 {

    public static void main(String... args) {

        String srcString = "Heeelloooooo Worrrrlld!";
        char[] src = srcString.toCharArray();

        System.out.println(src);

        char[] buffer = new char[12];
        int j = 0;
        boolean isFirstLLetter = true;

        for (int i = 0; i < src.length - 1; i++) {
            if (src[i] != src[i + 1]) {
                buffer[j++] = src[i];
            } else if (src[i] == 'l' && isFirstLLetter) {
                buffer[j++] = src[i];
                isFirstLLetter = false;
            }
        }

        buffer[j++] = src[src.length - 1];

        System.out.println(buffer);


    }

}

