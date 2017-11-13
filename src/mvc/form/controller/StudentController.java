package mvc.form.controller;

import mvc.form.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        //We have passed a blank Student object in the ModelAndView object with the name 'command' because the Spring
        //framework expects an object with the name 'command' if you are using <form:form> tags in your JSP file.
        //The student.jsp assumes that the variable name of the form backing object is 'command'. If you have put the
        //form backing object into the model under another name (definitely a best practice), then you can bind the
        //form to the named variable. (e.g. <form:form modelAttribute="studentVO">)
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    //An @ModelAttribute annotation on a method argument indicates the argument should be retrieved from the model.
    //@ModelAttribute annotation can be also used on a method.
    //If not present in the model, the argument should be instantiated first and then added to the model.
    //Once present in the model, the argument’s fields should be populated from all request parameters that have matching names.
    //This is known as data binding in Spring MVC, a very useful mechanism that saves you from having to parse each form field individually.
    public String addStudent(@ModelAttribute Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());

        return "result";
    }
}