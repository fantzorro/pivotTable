package org.example;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PivotTableDAO {
    private final SqlSession sqlSession;

    public PivotTableDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<PivotTable> selectWithParameter(String row, String col){
        PivotTableMapper mapper = sqlSession.getMapper(PivotTableMapper.class);
        return  mapper.selectWithParameter(row,col);
    }
}
