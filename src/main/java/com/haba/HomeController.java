package src.main.java.com.haba;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "home"
    }
}
