package by.hoodie.controller;


import by.hoodie.entity.Operation;
import by.hoodie.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/calc")
public class CalcController {

    @Autowired
    CalcService calcService = new CalcService();

    @GetMapping
    public String calc(){
        return "calc";
    }

    @PostMapping
    public String calc(Operation operation,HttpSession httpSession){
        String op = calcService.getOperation(operation);
        if ("sum".equals(op)) {
            httpSession.setAttribute("result", calcService.getResult(operation));
        } else if ("subtraction".equals(op)) {
            httpSession.setAttribute("result",  calcService.getResult(operation));
        } else if ("division".equals(op)){
            httpSession.setAttribute("result",  calcService.getResult(operation));
        } else if ("multiplication".equals(op)){
            httpSession.setAttribute("result",  calcService.getResult(operation));
        }
        return "calc";
    }
}
