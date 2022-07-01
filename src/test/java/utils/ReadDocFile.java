package utils;

import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.*;

public class ReadDocFile {
    public static void readDoc(String docPath) {

        File f = new File(docPath);
        try {
            InputStream in = new FileInputStream(f);
            WordExtractor ex = new WordExtractor(in);
            System.out.println(ex.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
