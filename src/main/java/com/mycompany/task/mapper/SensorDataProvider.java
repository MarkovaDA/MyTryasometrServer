package com.mycompany.task.mapper;

import com.mycompany.task.model.Location;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;



public class SensorDataProvider {
    
    //вставляем список значений в базу
    public String insertListOfLocations(Map params){
        
        List<Location> locations = (List<Location>)params.get("list");       
        StringBuilder query = 
            new StringBuilder("INSERT INTO tryasometr_v2.current_locations (lon,lat,deviceImei,dateTime) VALUES ");
        String comma = ",";
        String leftBkt = "(";
        String rightBkt = ")";
        locations.forEach(point -> query
                .append(leftBkt)
                .append(point.getLon())
                .append(comma)
                .append(point.getLat())
                .append(comma)
                .append("'" + point.getDeviceImei() + "'")
                .append(comma)
                .append("'" + point.getDataTime() + "'")
                .append(rightBkt)
                .append(comma)
        );
        query.deleteCharAt(query.length() - 1);
        String str = query.toString();
        return str;
    }
}
