package com.restapi.app;


import com.restapi.app.pojo.GetHumiData;
import com.restapi.app.pojo.GetInsideData;
import com.restapi.app.pojo.GetTempData;
import com.restapi.app.repos.HumiRepo;
import com.restapi.app.repos.InsideRepo;
import com.restapi.app.repos.TempRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class MainController {

    @Autowired
    private InsideRepo insideRepo;

    @Autowired
    private HumiRepo humiRepo;

    @Autowired
    private TempRepo tempRepo;


//    @GetMapping(path="/add")
//    public @ResponseBody
//    void addNewHumiData (@RequestParam String time
//            , @RequestParam String date, @RequestParam String value) {
//        GetHumiData getHumiData = new GetHumiData();
//        getHumiData.setDate(date);
//        getHumiData.setTime(time);
//        getHumiData.setValue(value);
//        humiRepo.save(getHumiData);
//    }

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
