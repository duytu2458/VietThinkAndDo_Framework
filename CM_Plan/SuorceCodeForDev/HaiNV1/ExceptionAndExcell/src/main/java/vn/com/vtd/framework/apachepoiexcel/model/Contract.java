package vn.com.vtd.framework.apachepoiexcel.model;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
    private String contractCode;
    private String contractProperties;
    private Date signDate;
    private BigDecimal salary;
    public Contract() {
    }
    public Contract(String contractCode, String contractProperties, Date signDate, BigDecimal salary) {
        super();
        this.contractCode = contractCode;
        this.contractProperties = contractProperties;
        this.signDate = signDate;
        this.salary = salary;
    }
    public String getContractCode() {
        return contractCode;
    }
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }
    public String getContractProperties() {
        return contractProperties;
    }
    public void setContractProperties(String contractProperties) {
        this.contractProperties = contractProperties;
    }
    public Date getSignDate() {
        return signDate;
    }
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
