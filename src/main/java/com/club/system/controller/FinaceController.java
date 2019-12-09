package com.club.system.controller;

import com.club.system.bean.Event;
import com.club.system.bean.Finace;
import com.club.system.service.EventService;
import com.club.system.service.FinaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class FinaceController {

    @Autowired
    FinaceService finaceService;


    @GetMapping("/api/finaname/")
    public List<Finace> findByFinanameContaining(String finaname){
        Sort sort=Sort.by(Sort.Direction.DESC,"finaid");
        return  finaceService.findbyFinanameContaining(finaname);
    }

    @GetMapping("/api/finaces")
    public List<Finace> finacelist() throws Exception {
        return finaceService.list();
    }

    @PostMapping("/api/finaces")
    public Finace addOrUpdate(@RequestBody Finace finace) throws Exception {
        finaceService.addOrUpdate(finace);
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
