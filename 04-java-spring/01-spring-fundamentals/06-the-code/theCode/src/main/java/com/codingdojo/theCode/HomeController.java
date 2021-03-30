package com.codingdojo.theCode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    
    private Boolean isCorrectCode(String code) {
		return code.equals("bushido");
	}
    
    @RequestMapping("/code")
    public String code() {
        return "code.jsp";
    }
    
    
    @RequestMapping(value="/code", method=RequestMethod.POST)
	public String Attempt(@RequestParam(value="code") String code, 
			Model model, RedirectAttributes rAttributes) {
		if(isCorrectCode(code)) {
			return "redirect:/code";
		}
		rAttributes.addFlashAttribute("error", "You do not know the way");
		return "redirect:/";		
	}
    
}