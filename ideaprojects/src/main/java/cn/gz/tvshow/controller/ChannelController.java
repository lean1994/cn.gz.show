package cn.gz.tvshow.controller;

import cn.gz.tvshow.pojo.ChannelModel;
import cn.gz.tvshow.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("Channel")
public class ChannelController {
    @Autowired
    ChannelService ChannelService;

    @RequestMapping("/SelectAllChannel")
    @ResponseBody
    public ChannelModel selectChannelByPrimeryKey(Integer id) {
        return ChannelService.selectByPrimaryKey(id);
    }

    @RequestMapping("index")
    public String indextest() {

        return "index.html";
    }
}
