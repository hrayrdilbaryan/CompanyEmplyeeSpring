package am.itspace.companyemplyeespring.controller;

import am.itspace.companyemplyeespring.entity.User;
import am.itspace.companyemplyeespring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/user")
    public String user(ModelMap modelMap) {
        List<User> users = userRepository.findAll();
        modelMap.addAttribute("user", users);
        return "user";

    }

    @GetMapping("/users/add")
    public String addUser() {
        return "addUser";
    }

    @PostMapping("users/add")
    public String add(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:/user";

    }

    @GetMapping("/users/delete")
    public String deleteUser(@RequestParam("id") int id) {
        userRepository.deleteById(id);
        return "redirect:/user";
    }

}
