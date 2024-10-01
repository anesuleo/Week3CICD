package ie.atu.week3cicd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class Week3 {
    @GetMapping("/message")
    public String getMessage(){
        return "Some Message";
    }

    @GetMapping("/details")
    public String getDetails(){
        return "Some Message";
    }

}
