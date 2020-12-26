package vn.com.vtd.framework.model.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private String productName;
    private double basalArea;
    private double availableArea;
    private double buildingArea;
    private int buildingsNumber;
}
