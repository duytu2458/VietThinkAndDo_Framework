package vn.com.vtd.framework.excel;

import org.junit.Assert;
import org.junit.Test;

import vn.com.vtd.framework.excel.utils.WorkbookUtil;

public class WorkbookUtilTest {
    @Test
    public void indexToColName() {
        Assert.assertEquals(WorkbookUtil.indexToColName(10), "K");
        Assert.assertEquals(WorkbookUtil.indexToColName(26), "AA");
    }
}
