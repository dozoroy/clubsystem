package com.lyh.ssm.crud.controller;

import com.lyh.ssm.crud.bean.Finace;
import com.lyh.ssm.crud.service.FinaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class FinaceController {

    @Autowired
    private FinaceService finaceService;

    @GetMapping("/api/finaname/")
    public List<Finace> findByFinanameContaining(String finaname){
        return  finaceService.findbyFinaname(finaname);
    }

    @GetMapping("/api/finaces")
    public List<Finace> finacelist() throws Exception {
        return finaceService.list();
    }

    @PostMapping("/api/finaces")
    public Finace addFinace(@RequestBody Finace finace) throws  Exception{
        finaceService.addFinace(finace);
        return finace;
    }

    @PutMapping("api/finaces")
    public Finace updateFinace(@RequestBody Finace finace) throws Exception {
        finaceService.updateFinace(finace);
        return finace;
    }

    @PostMapping("/api/finaces/delete")
    public void delete(@RequestBody Finace finace) throws Exception {
        finaceService.deleteById(finace.getFinaid());
    }

    @GetMapping("/api/clubs/{clubid}/finaces")
    public List<Finace> listByClubFinaces(@PathVariable("clubid") int clubid) throws Exception {
        if (0 != clubid) {
            return finaceService.listByClubFinaces(clubid);
        } else {
            return finacelist();
        }
    }

    @GetMapping("/api/finaces/{finaid}")
    public  List<Finace> finaceList(@PathVariable("finaid")int finaid) throws  Exception{
        if(0 != finaid){
            return  finaceService.listByFinaid(finaid);
        }else {
            return finacelist();
        }
    }
}
