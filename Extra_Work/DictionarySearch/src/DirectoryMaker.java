import java.io.File;

/**
 * Created by karodes on 7/17/2017.
 */

public class DirectoryMaker {
    static String[] strArr = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void makeDirectories() {
        for (String str : strArr) {
            File theDir = new File("dir/"+str);
            if (!theDir.exists()) {
                System.out.println("creating directory: " + theDir.getName());
                boolean result = false;
                try {
                    theDir.mkdir();
                    result = true;
                } catch (SecurityException se) {
                    //handle it
                }
                if (result) {
                    System.out.println("DIR created");
                }
            }
        }
    }
}
