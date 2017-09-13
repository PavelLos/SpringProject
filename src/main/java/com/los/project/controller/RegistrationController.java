package com.los.project.controller;

import com.los.project.model.UserProfileModel;
import com.los.project.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @PostMapping(value = {"/registration"})
    public ModelAndView registrationForm(@ModelAttribute("userForm") @Valid UserProfileModel accountDto, Model model,
                                         BindingResult result, WebRequest request, Errors errors){
        UserProfileModel userProfileModel = new UserProfileModel();
        model.addAttribute(userProfileModel);
        User registered = new User();
        if (!result.hasErrors()) {
            registered = createUserAccount(accountDto, result);
        }
        if (registered == null) {
            result.rejectValue("email", "message.regError");
        }
        return new ModelAndView();
    }
}
