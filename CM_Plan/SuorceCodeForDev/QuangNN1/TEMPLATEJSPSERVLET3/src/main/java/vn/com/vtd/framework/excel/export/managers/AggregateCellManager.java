package vn.com.vtd.framework.excel.export.managers;

import lombok.Data;
import vn.com.vtd.framework.excel.enums.AggregateType;

@Data
public class AggregateCellManager extends BaseCellManager {
    private AggregateType aggregateType;
}