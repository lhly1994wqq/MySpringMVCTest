package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ProductController {

    @RequestMapping("/addProduct")
    public ModelAndView addProduct(Product product)throws Exception{
        ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }
}
