package vn.com.vtd.framework.excel.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.model.StylesTable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import vn.com.vtd.framework.excel.imports.DataSet;
import vn.com.vtd.framework.excel.parameters.FieldSetting;
import vn.com.vtd.framework.excel.parameters.ImportPara;

@Data
public class ImportContext {
    @Setter(AccessLevel.NONE)
    private int curSheetIndex = -1;

    @Setter(AccessLevel.NONE)
    private String curSheetName;

    @Setter(AccessLevel.NONE)
    private ImportPara curImportPara;

    @Setter(AccessLevel.NONE)
    private List<ImportPara> importParas;

    @Setter(AccessLevel.NONE)
    private Map<Integer, Map<String, String>> sheetFieldNames = new HashMap<>();

    @Setter(AccessLevel.NONE)
    private Map<Integer, String> sheetIndexNames = new HashMap<>();

    private SharedStringsTable sharedStringsTable;
    private StylesTable stylesTable;

    @Setter(AccessLevel.NONE)
    private DataSet dataSet = new DataSet(this);

    public ImportContext(List<ImportPara> importParas) {
        this.importParas = importParas;
        for (ImportPara importPara : importParas) {
            Map<String, String> fieldNameMap = new HashMap<>();
            for (FieldSetting fieldSetting : importPara.getFieldSettings()) {
                fieldNameMap.put(fieldSetting.getDisplayName(), fieldSetting.getFieldName());
            }
            if (!sheetFieldNames.containsKey(importPara.getSheetIndex()))
                sheetFieldNames.put(importPara.getSheetIndex(), fieldNameMap);
        }
    }

    public boolean initSheet(XSSFReader.SheetIterator sheetIterator) {
        ++curSheetIndex;
        curSheetName = sheetIterator.getSheetName();
        dataSet.put(curSheetName, new ArrayList<>());
        sheetIndexNames.put(curSheetIndex, curSheetName);
        Optional<ImportPara> curImportPara = importParas
                .stream()
                .filter(m -> m.getSheetIndex() == curSheetIndex)
                .findFirst();
        if (curImportPara.isPresent()) {
            this.curImportPara = curImportPara.get();
        }
        else {
            this.curImportPara = null;
            return false;
        }
        return true;
    }
}
