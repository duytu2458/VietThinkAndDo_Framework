package vn.com.vtd.framework.excel.export.managers;

import lombok.Data;
import org.apache.poi.ss.usermodel.CellStyle;

@Data
public class CellManager extends BaseCellManager {
    private String colName;
    private CellStyle cellStyle;
}