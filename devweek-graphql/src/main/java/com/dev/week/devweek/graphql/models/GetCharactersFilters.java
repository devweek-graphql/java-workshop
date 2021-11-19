package com.dev.week.devweek.graphql.models;

import com.dev.week.devweek.commons.enums.CharacterUniverseEnum;

public class GetCharactersFilters {
    
    private CharacterUniverseEnum universe;

    private String sortBy;

    private SortEnum order;

    private Integer limit;

    private Integer offset;

    public CharacterUniverseEnum getUniverse() {
        return universe;
    }

    public void setUniverse(CharacterUniverseEnum universe) {
        this.universe = universe;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public SortEnum getOrder() {
        return order;
    }

    public void setOrder(SortEnum order) {
        this.order = order;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
