package com.hainv.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.hainv.exception.CustomizeException;
import com.hainv.model.Product;
import com.hainv.parameters.DirectExportPara;
import com.hainv.parameters.ImportPara;
import com.hainv.parameters.TemplateExportPara;
import com.hainv.service.AutoExcel;
import com.hainv.service.DataDirection;
import com.hainv.service.ExcelSetting;

public class AutoExcelTest {
    private static final Log log = LogFactory.getLog(AutoExcelTest.class);
    @Test
    public void exportWithTemplate() throws Exception {
        List<TemplateExportPara> paras = new ArrayList<>();

        paras.add(new TemplateExportPara("BusinessUnit", DataGenerator.genBusinessUnit()));
        paras.add(new TemplateExportPara("Contract", DataGenerator.genContracts()));
        paras.add(new TemplateExportPara("Project", DataGenerator.genProjects()));

        List<Product> products = DataGenerator.genProducts();
        TemplateExportPara para3 = new TemplateExportPara("Product", products);
        para3.setInserted(true);
        paras.add(para3);

        TemplateExportPara para5 = new TemplateExportPara("Product2", products);
        para5.setDataDirection(DataDirection.Right);
        paras.add(para5);

        ExcelSetting excelSetting = new ExcelSetting();
        excelSetting.setRemovedSheets(Arrays.asList("will be removed"));

        AutoExcel.save(this.getClass().getResource("/template/Common.xlsx").getPath(),
                this.getClass().getResource("/").getPath() + "ExportWithTemplate.xlsx",
                paras,
                excelSetting);
    }

    @Test
    public void exportDirectly() {
        try {
            String outputPath = this.getClass().getResource("/").getPath() + "Export.xlsx";
            List<DirectExportPara> paras = new ArrayList<>();
            paras.add(new DirectExportPara(DataGenerator.genProjects(), "Projects", DataGenerator.genProjectFieldSettings()));
            paras.add(new DirectExportPara(DataGenerator.genContracts()));
            AutoExcel.save(outputPath, paras);
        }catch (CustomizeException e) {
            log.error(e.getCause() + " - Error Code:" + e.getCode() + " - " + e.getMessage());
        }

    }

    @Test
    public void importExcel() throws Exception {
        List<ImportPara> importParas = new ArrayList<ImportPara>() {{
            add(new ImportPara("BusinessUnit"));
            add(new ImportPara("Contract", DataDirection.Down));
            add(new ImportPara("Project", DataDirection.Down));
//            add(new ImportPara("Product", DataDirection.Down));   not supported now
        }};
        String fileName = this.getClass().getResource("/").getPath() + "ExportWithTemplate.xlsx";
        HashMap<String, List<HashMap<String, Object>>> datas = AutoExcel.read(fileName, importParas);
    }
}
