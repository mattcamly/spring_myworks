package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class MentorController {
@RequestMapping("/list")
    public String showTable(Model model){

    List<Mentor> mentorList = new ArrayList<>();
    mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
    mentorList.add(new Mentor("Matt","Hanks",35, Gender.MALE));
    mentorList.add(new Mentor("Mary","Brtyan",42, Gender.FEMALE));

    model.addAttribute("mentors",mentorList);

    return "mentor/mentor-list";

    }


}
