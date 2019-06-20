package com.recordcollection.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ioannis Matzakos on 22/03/2019.
 */

@Controller
public class IndexController {

    @RequestMapping({"/", ""})
    public String index(){
        return "index";
    }
}