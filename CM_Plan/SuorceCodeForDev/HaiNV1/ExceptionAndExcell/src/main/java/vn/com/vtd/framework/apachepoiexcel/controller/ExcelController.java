package vn.com.vtd.framework.apachepoiexcel.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.com.vtd.framework.apachepoiexcel.service.ExcelService;
import vn.com.vtd.framework.apachepoiexcel.utils.Globals;


@RestController
@RequestMapping("/excel")
public class ExcelController {
    @Autowired
    private ExcelService excelService;
    @Autowired
    private HttpServletResponse response;

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/read/{fileName}", method = RequestMethod.GET)
    public List read(@PathVariable String fileName) throws IOException {
        Resource resource = new ClassPathResource(Globals.DOC + File.separator + fileName + Globals.SUFFIX_XLS);
        File file = resource.getFile();
        List<List<Object>> list = excelService.readExcel(file);
        return list;
    }

    @RequestMapping(value = "/export/{fileName}", method = RequestMethod.GET)
    public String export(@PathVariable String fileName) throws IOException {
        String docsPath = excelService.export2003(fileName, response);
        return docsPath;
    }

    @RequestMapping(value = "/export2007/{fileName}", method = RequestMethod.GET)
    public String export2007(@PathVariable String fileName) throws IOException {
        String docsPath = excelService.export2007(fileName, response);
        return docsPath;
    }
}
