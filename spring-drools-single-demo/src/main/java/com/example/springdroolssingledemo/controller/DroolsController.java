package com.example.springdroolssingledemo.controller;


import org.kie.api.cdi.KSession;
import org.kie.api.runtime.ExecutionResults;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.command.CommandFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DroolsController {
    @Resource
    KieContainer kieContainer;

    @KSession("KSession")
    private StatelessKieSession statelessKieSession;

    @RequestMapping("drools")
    String drooleDemo() {
        kieContainer.getKieSessionModel("");
        StatelessKieSession kieSession2 = kieContainer.newStatelessKieSession("KSession");
        List cmds = new ArrayList();

        ExecutionResults results =
                statelessKieSession.execute( CommandFactory.newBatchExecution( cmds ) );


        return "drools";

    }
}
