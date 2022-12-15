package Seminar_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Seminar2_3 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("src", "Seminar_2", "file.txt");
        OutputStream ops = Files.newOutputStream(file);

        BufferedWriter bfw = Files.newBufferedWriter(file);
        bfw.append("afwergfwesrg");
        bfw.flush();
        bfw.close();
    }
}
