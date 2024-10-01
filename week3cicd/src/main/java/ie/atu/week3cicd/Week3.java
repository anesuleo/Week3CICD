package ie.atu.week3cicd;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class Week3 {
    @GetMapping("/message")
    public String getMessage(){
        return "Some Message";
    }

    @GetMapping("/details")
    public String getDetails(){
        return "Some Other Message";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hi " + name;
    }

    @GetMapping("/detail")
    public String details(@RequestParam int age, @RequestParam String name){
        return "name: " + name + " age: " + age;
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String method)
    {
        int ans = 0;
        switch(method){
            case "add":
                ans = num1 + num2;
                break;
            case "subtract":
                ans = num1 - num2;
                break;
            case "multiply":
                ans = num1*num2;
                break;
            case "divide":
                if(num2 == 0){
                    String error = "Error";
                    return error;
                }
                ans = num1/num2;
                break;
            default:
                String error1 = "Error";
                return error1;
        }

        return "If you " + method + " " + num1 + " and " + num2 + " you get " + ans;
    }
}
