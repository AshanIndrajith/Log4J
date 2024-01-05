package com.example.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class);

    static {
        BasicConfigurator.configure();
    }

    @GetMapping("/")
    public String index() {
        logger.debug("Loading Index.....");
        return "index";
    }
}
