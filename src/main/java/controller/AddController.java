package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.AddService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Defining controller (Spring)
@Controller
public class AddController {

    //Defining URL for the below method
    @RequestMapping("/add")
    public ModelAndView addValueController(@RequestParam("n1") Integer fnum, @RequestParam("n2") Integer snum,
                                           HttpServletRequest request, HttpServletResponse response) {

        //Getting values from the form
        //The values were commented out after we added @RequestParam annotation to request for these values
        /*Integer fnum = Integer.parseInt(request.getParameter("n1"));
        Integer snum = Integer.parseInt(request.getParameter("n2"));*/

        AddService addServiceObject = new AddService();
        fnum = addServiceObject.addNumbers(fnum, snum);

        //Defining the JSP and values for JSP
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("forms/displayPage");
        modelAndView.addObject("result", fnum);

        return modelAndView;
    }
}
