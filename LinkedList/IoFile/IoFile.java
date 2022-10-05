package IoFile;

import java.io.File;

public class IoFile {
    public static void main(String[] args) {
        File file = new File("chill.txt");
        System.out.println(file.isFile());
    }
}
