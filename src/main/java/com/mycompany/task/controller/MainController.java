
package com.mycompany.task.controller;

import com.mycompany.task.mapper.SensorDataMapper;
import com.mycompany.task.model.Acceleration;
import com.mycompany.task.model.Location;
import com.mycompany.task.model.ResponseEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class MainController {
    
    @Autowired
    private SensorDataMapper sensorMapper;
    //http://localhost:8080/tryasometr/
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelMap map) {
        ModelAndView model = new ModelAndView("index");
        return model;
    }
    
    @PostMapping(value="/save_location/")
    @ResponseBody
    public  ResponseEntity saveLocations(@RequestBody List<Location> list){
        //sensorMapper.insertLocation(list.get(0));//сейчас сохраняются одинаковые данные, потому что список не меняется
        sensorMapper.insertLocations(list);
        ResponseEntity entity = new ResponseEntity();
        entity.setStatus("OK");
        return entity;
    }
        
    @PostMapping(value="/save_acceleration/")
    @ResponseBody
    public ResponseEntity saveAccelerations(@RequestBody List<Acceleration> list){
        ResponseEntity entity = new ResponseEntity();
        entity.setStatus("OK");
        return entity;
    }
}
