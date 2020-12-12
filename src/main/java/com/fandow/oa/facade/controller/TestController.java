package com.fandow.oa.facade.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fandow.oa.common.core.pagination.PageInfo;
import com.fandow.oa.domain.po.OaActivityLog;
import com.fandow.oa.domain.service.OaActivityLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author <a href="mailto::liruizhao0302@dingtalk.com">李锐钊</a>
 * @since 2020/12/12
 */
@RestController
public class TestController {

    @Resource
    private OaActivityLogService oaActivityLogService;

    @GetMapping("/test")
    public String test() {
            return "Hello world" + new Date().toString();
    }

    @GetMapping("/list")
    public OaActivityLog listLog()  {
        //参数一是当前页，参数二是每页个数
        IPage<OaActivityLog> userPage = new Page<>(1, 20);
        return oaActivityLogService.lambdaQuery()
                .eq(OaActivityLog::getId, 1)
                .one();
    }
}
