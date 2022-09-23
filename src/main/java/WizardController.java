import org.atmosphere.inject.annotation.RequestScoped;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WizardController {
    @RequestMapping(value = "/wizards", method = RequestMethod.GET)
    public String getAll() {
        return "a";
    }

}
