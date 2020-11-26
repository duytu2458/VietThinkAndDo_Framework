package com.hainv.managers;

public class AggregateCellManager extends BaseCellManager {
    private AggregateType aggregateType;

    public AggregateType getAggregateType() {
        return aggregateType;
    }

    public void setAggregateType(AggregateType aggregateType) {
        this.aggregateType = aggregateType;
    }
}