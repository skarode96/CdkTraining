import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* Class Trie Test */
public class TrieTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of AATree */
        Trie t = new Trie();
        System.out.println("Trie Test\n");
        char ch;
        /*  Perform tree operations  */
        do
        {
            System.out.println("\nTrie Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    BufferedReader br = new BufferedReader(new FileReader("src/words_alpha.txt"));
                    String line = null;
                    StringBuffer stringBuffer = new StringBuffer("");
                    while ((line = br.readLine()) != null) {
                        stringBuffer.append(line);
                        stringBuffer.append(" ");
                    }
                    String string = stringBuffer.toString();
                    String[] words = string.split("\\s");
                    for (String word : words)
                        t.insert(word);
                    break;
                case 2 :
                    System.out.println("Enter string element to delete");
                    try
                    {
                        t.remove( scan.next() );
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage()+" not found ");
                    }
                    break;
                case 3 :
                    System.out.println("Enter string element to search");
                    System.out.println("Search result : "+ t.search( scan.next() ));
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
