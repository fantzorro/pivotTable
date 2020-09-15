package org.example;

import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface PivotTableMapper {

    public List<PivotTable> selectWithParameter(@Param("row")String row, @Param("col")String col);
}
