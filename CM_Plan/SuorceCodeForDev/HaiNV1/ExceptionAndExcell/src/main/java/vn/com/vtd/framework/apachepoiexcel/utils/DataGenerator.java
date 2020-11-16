package vn.com.vtd.framework.apachepoiexcel.utils;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import vn.com.vtd.framework.apachepoiexcel.model.Contract;

public class DataGenerator {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static List<Contract> genContracts() throws ParseException {
        List<Contract> contracts = new ArrayList<Contract>();
        contracts.add(new Contract("C0000-0001","Expected contract", format.parse("2020-08-14 17:32"), new BigDecimal("28500.00")));
        contracts.add(new Contract("C0000-0002","Expected non-contract", format.parse("2019-08-14 07:32"), new BigDecimal("1028500.00")));
        contracts.add(new Contract("C0000-0003","Expected contract", format.parse("2018-10-01 00:00"), new BigDecimal("2000000.00")));
        contracts.add(new Contract("C0000-0004","Expected non-contract", format.parse("2020-01-14 19:32"), new BigDecimal("10031500.00")));
        contracts.add(new Contract("C0000-0005","Expected contract", format.parse("2020-07-15 18:10"), new BigDecimal("28500.00")));
        return contracts;
    }

    public static String[] getHeader() {
        String[] header = { "ID", "TYPE", "DATE", "SALARY"};
        return header;
    }
}