
package com.mycompany.task.mapper;

import com.mycompany.task.model.Acceleration;
import com.mycompany.task.model.Location;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface BusVehicleMapper {
    
    //операции для работы с базой данных
    /*@Select("select * from vistar_marshrut.busVehicle limit 1")
    BusVehicle getEntity();*/
    
   
    
    @Insert("insert into tryasometr.v2.current_locations values(#{lon},#{lat},#{deviceImei},#{dateTime})")
    void insertLocation(Location location);
    
    @Insert("insert into tryasometr.v2.current_accelerations values(#{accelX},#{accelY},#{accelZ},#{deviceImei},#{dateTime})")
    void insertAcceleration(Acceleration acceleration);
    
    
    
    
    
}
