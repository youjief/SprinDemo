package demo.controller;


import demo.po.DemoNamePO;
import demo.service.DemoNameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "用户控制")
@RequestMapping(value = "/test")
@RestController
public class TestController {
    @Autowired
    private DemoNameService demoNameService;


    @ApiOperation(value = "用id查找用户")
    @PostMapping(value = "/getById")
    //用id查找用户
    public DemoNamePO get(Long id) {
        return demoNameService.getById(id);
    }



    @ApiOperation(value = "增加")
    @PostMapping(value = "/search")
    //用id查找用户
    public int add(DemoNamePO demoNamePO) {
        return demoNameService.add(demoNamePO);
    }




}
