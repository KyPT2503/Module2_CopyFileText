import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            File originFile = new File("css.txt");
            File newFile = new File("newCss.txt");
            BufferedReader originFileBufferedRead = new BufferedReader(new FileReader(originFile));
            BufferedWriter newFileBufferedWriter = new BufferedWriter(new FileWriter(newFile));
            String line = null;
            while ((line = originFileBufferedRead.readLine()) != null) {
                newFileBufferedWriter.write(line + "\n");
            }
            newFileBufferedWriter.flush();
            originFileBufferedRead.close();
            newFileBufferedWriter.close();
        } catch (Exception e) {
            System.out.println("File does not exist.");
        }
    }
}
