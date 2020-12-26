package vn.com.vtd.framework.excel.parameters;

import lombok.Data;

import java.util.List;

@Data
public class ExcelSetting {
    /**
     * The name of the worksheet to be removed
     */
    private List<String> removedSheets;
}
