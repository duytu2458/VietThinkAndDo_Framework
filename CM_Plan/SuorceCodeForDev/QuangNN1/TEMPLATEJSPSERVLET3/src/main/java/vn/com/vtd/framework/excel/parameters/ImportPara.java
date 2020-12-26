package vn.com.vtd.framework.excel.parameters;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import vn.com.vtd.framework.excel.exception.AutoExcelException;

@Data
public class ImportPara {
    /**
     * sheet index, starting from 0
     */
    private int sheetIndex;
    /**
     * title index, default is 0
     */
    private int titleIndex = 0;
    /**
     * data index, default is 1
     */
    private int dataStartIndex = 1;

    private List<FieldSetting> fieldSettings = new ArrayList<>();

    /**
     *
     * @param sheetIndex sheet index, start form 0
     */
    public ImportPara(int sheetIndex) {
        this.sheetIndex = sheetIndex;
    }

    /**
     *
     * @param sheetIndex sheet index, start form 0
     * @param fieldSettings
     */
    public ImportPara(int sheetIndex, List<FieldSetting> fieldSettings) {
        this.sheetIndex = sheetIndex;
        this.fieldSettings = fieldSettings;
    }

    /**
     *
     * @param sheetIndex sheet index, start form 0
     * @param fieldSettings
     * @param titleIndex title index, start form 0
     * @param dataStartIndex data index, start form 0
     */
    public ImportPara(int sheetIndex, List<FieldSetting> fieldSettings, int titleIndex, int dataStartIndex) {
        if (titleIndex >= dataStartIndex)
            throw new AutoExcelException("titleIndex must be less than dataStartIndex.");

        this.sheetIndex = sheetIndex;
        this.fieldSettings = fieldSettings;
        this.titleIndex = titleIndex;
        this.dataStartIndex = dataStartIndex;
    }
}
