package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PivotTableController {
    private PivotTableDAO pivotTableDAO;

    @Autowired
    public PivotTableController(PivotTableDAO pivotTableDAO) {
        this.pivotTableDAO = pivotTableDAO;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<PivotTable> selectWithParameter(@RequestParam(value = "row") String row, @RequestParam(value = "col") String col){
        return pivotTableDAO.selectWithParameter(row,col);
    }
}
