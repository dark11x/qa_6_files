package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class PdfFileTest {

    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "src/test/resources/files/1.pdf";
        String expectedData = "123456";

        PDF pdf = new PDF(new File(pdfFilePath));
        assertThat(pdf, PDF.containsText(expectedData));
    }
}
