package control;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
public class ExcelHendler {
    FileInputStream file = new FileInputStream(new File(fileLocation));
    Workbook workbook = new XSSFWorkbook(file);
}
