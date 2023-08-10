package co.com.choucair.ejemplo.models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetDataReunion {

    public List<DataReunion> setData(DataTable dataTable) {
        List<DataReunion> dates= new ArrayList<>();
        List<Map<String,String>> mapInfo = dataTable.asMaps();
        for(Map<String,String> map:mapInfo){
            dates.add(new ObjectMapper().convertValue(map,DataReunion.class));
        }
        return dates;
    }

}
