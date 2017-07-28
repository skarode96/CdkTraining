import java.io.*;

/**
 * Created by karodes on 7/17/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String data = new String(ReadData.readData());
       // DirectoryMaker.makeDirectories();
        String[] words = data.split(" ");
        for(String word: words) {
            //System.out.println(word);
            if(word.length()>1) {
                BufferedWriter bw = null;
                FileWriter fw = null;
                try {
                    File f = new File("dir/" + word.toLowerCase().charAt(0)+"/"+word.toLowerCase().charAt(0)+".txt");
                    if (!f.exists()) {
                        f.createNewFile();
                    }
                    fw = new FileWriter(f.getAbsoluteFile(), true);
                    bw = new BufferedWriter(fw);
                    bw.write(word+" \n");
//                    System.out.println("Done");
                } catch (IOException e) {

                    e.printStackTrace();

                } finally {

                    try {

                        if (bw != null)
                            bw.close();

                        if (fw != null)
                            fw.close();

                    } catch (IOException ex) {

                        ex.printStackTrace();

                    }
                }
            }

        }
    }
}

