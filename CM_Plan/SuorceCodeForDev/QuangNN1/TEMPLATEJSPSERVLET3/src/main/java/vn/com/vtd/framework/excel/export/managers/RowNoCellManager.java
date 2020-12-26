package vn.com.vtd.framework.excel.export.managers;

import lombok.Data;
import org.apache.poi.ss.usermodel.CellStyle;

@Data
public class RowNoCellManager extends BaseCellManager {
    private CellStyle cellStyle;
}
