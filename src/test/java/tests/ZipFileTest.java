package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.TestFiles.readTextFromPath;
import static utils.UnzipFile.unzip;

public class ZipFileTest {

    @Test
    void zipTest() throws IOException, ZipException {

        String zipFilePath = "src/test/resources/files/1.zip";
        String unzipFolderPath = "src/test/resources/files/unzip";
        String zipPassword = "";
        String unzipTxtFilePath = "src/test/resources/files/unzip/1.txt";
        String expectedData = "123456";

        unzip(zipFilePath, unzipFolderPath, zipPassword);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
