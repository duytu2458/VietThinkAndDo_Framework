[中文](https://github.com/feng-haitao/auto-excel/blob/master/README.zh.md) | English | [Documentation](https://github.com/feng-haitao/auto-excel/wiki)

## Why AutoExcel?

Excel import and export is very common in software development, as long as you are a programmer, you have met. I believe that many people will choose to use Apache POI to complete this work like me. While feeling the power of POI, my team also encountered the following problems:

1. Directly use POI to operate Excel will generate a lot of hard code, you will hardly write row index and column index in the code.
2. A large number of non-reusable format control codes, such as background color, alignment, cell style, etc.
3. The implementation consultant clearly provided a ready-made template, but had to develop the code to implement it again, resulting in low development efficiency.
4. Development resources have to be used when the template is adjusted.
5. Simple export also requires specific code.

**AutoExcel** solves the above problems. It is very simple and only requires a small amount of code to complete complex import and export. When using it, programmers have no sense of import and export, that is, there is no need to directly manipulate POI. At the same time, the implementation consultant provides Excel is the import and export template, unless new data sources or fields are added, the template update does not need to use development resources.

**AutoExcel** does not over-encapsulate the POI, but makes full use of Excel's own feature-the name manager, through some tricks, the cell and the data source are mapped, thereby decoupling the programmer and the POI, and avoid hard code, so that import and export work becomes enjoyable and no longer boring.

## Features

- Export with template
  - Support multiple sheets
  - Support basic object and table data
  - A single sheet supports multiple data sources of variable length
  - Support horizontal filling of data
  - Automatically apply cell style
  - Auto fill in line number
  - Auto fill formula
  - Automatic summary
- Export directly
  - Support multiple sheets
  - Export with basic style
  - Automatically adjust column width
- Import
  - Support multiple sheets
  - Automatic data type conversion
- Support millions of data import and export in seconds

## Function preview

| Before export                                                | After export                                                 |
| :----------------------------------------------------------- | ------------------------------------------------------------ |
| ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/basic_object.png) | ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/basic_object_result.png) |
| ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/single_table.png) | ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/single_table_result.png) |
| ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/multi_table.png) | ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/multi_table_result.png) |
| ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/fill_data_to_the_right.png) | ![image](http://www.fenghaitao.net/wp-content/uploads/2020/12/fill_data_to_the_right_result.png) |

To achieve all of the above exports, you only need to write the following small amount of code (you need additional code to prepare the data source, for example, from the database. In the following example, use `DataGenerator` to generate demo data)

```java
// Set export parameters, such as data source name, data source, etc.
List<TemplateExportPara> paras = new ArrayList<>();
paras.add(new TemplateExportPara("BusinessUnit", DataGenerator.genBusinessUnit()));
paras.add(new TemplateExportPara("Contract", DataGenerator.genContracts()));
paras.add(new TemplateExportPara("Project", DataGenerator.genProjects(1)));

List<Product> products = DataGenerator.genProducts(1);
TemplateExportPara para3 = new TemplateExportPara("Product", products);
// When a single sheet has multiple data sources, the data source above should be set to inserted
para3.setInserted(true);
paras.add(para3);

TemplateExportPara para5 = new TemplateExportPara("Product2", products);
// Horizontal fill
para5.setDataDirection(DataDirection.Right);
paras.add(para5);

// (Optional operation) Remove unnecessary sheets
ExcelSetting excelSetting = new ExcelSetting();
excelSetting.setRemovedSheets(Arrays.asList("will be removed"));

AutoExcel.save(this.getClass().getResource("/template/Export.xlsx").getPath(),
               this.getClass().getResource("/").getPath() + "AutoExcel.xlsx",
               paras,
               excelSetting);
```

## Million data test

Unit: ms
|                          | 10W rows and 10 columns of data | 100W rows and 10 columns of data |
| ------------------------ | ------------------------------- | -------------------------------- |
| Export with template     | 6,258                           | 23,540                           |
| Export directly          | 5,711                           | 24,952                           |
| Import                   | 4,466                           | 21,595                           |
| Import + Type conversion | 4,823                           | 26,279                           |

For more functions, please go to [Documentation](https://github.com/feng-haitao/auto-excel/wiki).
