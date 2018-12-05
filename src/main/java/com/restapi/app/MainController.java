package com.restapi.app;


import com.restapi.app.pojo.GetControlData;
import com.restapi.app.pojo.GetHumiData;
import com.restapi.app.pojo.GetInsideData;
import com.restapi.app.pojo.GetTempData;
import com.restapi.app.repos.ControlRepo;
import com.restapi.app.repos.HumiRepo;
import com.restapi.app.repos.InsideRepo;
import com.restapi.app.repos.TempRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/home")
public class MainController {

    @Autowired
    private InsideRepo insideRepo;

    @Autowired
    private HumiRepo humiRepo;

    @Autowired
    private TempRepo tempRepo;

    @Autowired
    private ControlRepo controlRepo;


    @RequestMapping(path="/add")
    public @ResponseBody
    void setControl (@RequestParam(value = "mode", defaultValue = "0") String i, @RequestParam(value = "system", defaultValue = "humiCont") String system) {
        controlRepo.updateControl(i, system);

    }

    @GetMapping(path="/GetHumiData")
    public @ResponseBody Iterable<GetHumiData> getAllHumiData() {
        return humiRepo.findAll();
    }
    @GetMapping(path="/GetInsideData")
    public @ResponseBody Iterable<GetInsideData> getAllInsideData() {
        return insideRepo.findAll();
    }
    @GetMapping(path="/GetTempData")
    public @ResponseBody Iterable<GetTempData> getAllTempData() {
        return tempRepo.findAll();
    }


}
