package generics;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getCellValue(String path, String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String value=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}