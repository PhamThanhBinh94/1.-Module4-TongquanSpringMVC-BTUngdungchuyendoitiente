package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculationController {
    @GetMapping("/ahihi")
    public String input(){
        return "input";
    }
   @PostMapping("/convert")
    public String convertCurrency(@RequestParam String usd, String rate, Model model){
        float result = Float.parseFloat(usd)*Float.parseFloat(rate);
        model.addAttribute("result1", result);
        return "result";
   }
}
