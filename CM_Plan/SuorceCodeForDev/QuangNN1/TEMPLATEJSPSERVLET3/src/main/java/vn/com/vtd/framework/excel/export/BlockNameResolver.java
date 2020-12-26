package vn.com.vtd.framework.excel.export;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;

import lombok.Data;
import vn.com.vtd.framework.excel.export.managers.AggregateCellManager;
import vn.com.vtd.framework.excel.export.managers.CellManager;
import vn.com.vtd.framework.excel.export.managers.FormulaCellManager;
import vn.com.vtd.framework.excel.export.managers.RowNoCellManager;
import vn.com.vtd.framework.excel.parameters.TemplateExportPara;

@Data
public class BlockNameResolver {
    private String dataSourceName;
    private String originalDataSourceName;
    private String sheetName;
    private Sheet sheet;
    /**
     * field name - CellManager map
     */
    private Map<String, CellManager> fieldNameCells = new HashMap<>();
    private Map<String, AggregateCellManager> fieldNameAggregateCells = new HashMap<>();
    /**
     * lowerCase field name - original field name map
     */
    private Map<String, String> fieldNameMap = new HashMap<>();
    private List<FormulaCellManager> formulaCellManagers = new ArrayList<>();
    private RowNoCellManager rowNoCellManager;
    private TemplateExportPara Para;
}
