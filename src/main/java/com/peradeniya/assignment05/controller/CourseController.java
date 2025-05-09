import ch.qos.logback.core.model.Model;
import com.peradeniya.assignment05.dao.CourseDAO;
import com.peradeniya.assignment05.dao.RegistrationDAO;
import com.peradeniya.assignment05.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseDAO courseDAO;
    @Autowired
    private RegistrationDAO registrationDAO;

    @GetMapping
    public String listCourses(Model model) {
        model.addAttribute("courses", courseDAO.getAllCourses());
        return "courses";
    }

    @PostMapping("/register/{courseId}")
    public String registerCourse(
            @PathVariable int courseId,
            HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        if (student != null) {
            registrationDAO.register(student.getStudentId(), courseId);
        }
        return "redirect:/courses";
    }
}