package com.tensquare.base.controller;

import com.tensquare.base.entity.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, StatusCode.OK, "查询成功",labelService.findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{labelId}")
    public Result findOne(@PathVariable("labelId") String labelId) {
        return new Result(true, StatusCode.OK, "查询成功",labelService.findById(labelId));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Label label) {
        labelService.save(label);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{labelId}")
    public Result update(@RequestBody Label label, @PathVariable("labelId") String labelId) {
        labelService.update(label);
        return new Result(true, StatusCode.OK, "更新成功");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{labelId}")
    public Result delete(@PathVariable("labelId") String labelId) {
        labelService.delete(labelId);
        return new Result(true, StatusCode.OK, "删除成功");
    }
}
