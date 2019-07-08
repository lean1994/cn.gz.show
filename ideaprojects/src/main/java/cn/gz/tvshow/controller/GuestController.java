package cn.gz.tvshow.controller;

import cn.gz.tvshow.pojo.GuestModel;
import cn.gz.tvshow.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {
    @Autowired
    GuestService guestService;

    @RequestMapping("/insertGuest")
    public int insertGuest(GuestModel guest) {
        return guestService.insert(guest);
    }

    @RequestMapping("/SelectGuest")
    public List<GuestModel> selectGuest(GuestModel guest) {
        return guestService.select(guest);
    }

    @RequestMapping("/UpdateGuest")
    public int updateGuest(GuestModel guest) {
        return guestService.updateById(guest);
    }
}
