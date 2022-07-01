package tests;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.ReadDocFile.readDoc;
import static utils.TestFiles.readTextFromPath;

public class DocFileTest {

@Test
    void docTest() throws IOException {

        String docFilePath = "src/test/resources/files/1.doc";
        String expectedData = "123456";

        readDoc(docFilePath);

        String actualData = readTextFromPath(docFilePath);
        assertThat(actualData, containsString(expectedData));

    }
}
