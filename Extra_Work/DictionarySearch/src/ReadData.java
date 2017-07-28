import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by karodes on 7/17/2017.
 */
public class ReadData {
    public static StringBuffer readData() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("src/words_alpha.txt"));
        StringBuffer everything = new StringBuffer();
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(" ");
                line = br.readLine();
            }
            everything.append(sb.toString());
//            System.out.println(everything);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return everything;
    }

}
