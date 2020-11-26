package com.hainv.parameters;

import java.util.List;

import com.hainv.service.DataSourceType;

public abstract class ExportPara {
    /**
     * Data source
     */
    private Object dataSource;
    private DataSourceType dataSourceType;
    private Class objectType;
    private int recordCount;

    public Object getDataSource() {
        return dataSource;
    }

    public void setDataSource(Object value) {
        dataSource = value;
        if (dataSource != null) {
            if (dataSource instanceof List) {
                List<Object> tmpDataSource1 = (List<Object>) dataSource;
                //If the data source is an array or list
                if (tmpDataSource1.isEmpty()) {
                    dataSource = null;
                } else {
                    objectType = tmpDataSource1.get(0).getClass();
                    dataSourceType = dataSourceType.List;
                    recordCount = tmpDataSource1.size();
                }
            } else {
                //If the data source is a base object
                objectType = dataSource.getClass();
                dataSourceType = dataSourceType.BasicObject;
                recordCount = 1;
            }
        }
    }

    public DataSourceType getDataSourceType() {
        return dataSourceType;
    }

    public Class getObjectType() {
        return objectType;
    }

    public int getRecordCount() {
        return recordCount;
    }

}
