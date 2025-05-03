package com.example.projet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@Controller
public class studentList {
    List<Student> stds = new ArrayList<Student>();
    Student st = new Student();

    @GetMapping("/moy")
    public String afficherst(Model model){
        Student moyst = this.st;
        double moy = 0;
        moy= (double) ((st.getnote1()+ st.getnote2()+st.getnote3())/3);
        moyst.setNote1(Math.round(moy*100.0)/100.0);
        model.addAttribute("moy", moyst);
        return "moy";
    }

    @PostMapping("/etudiant")
    public  ResponseEntity<Void> recevoirst(@RequestBody Student st, Model model) {
        this.st = st;
        return ResponseEntity.ok().build();
    }

}
