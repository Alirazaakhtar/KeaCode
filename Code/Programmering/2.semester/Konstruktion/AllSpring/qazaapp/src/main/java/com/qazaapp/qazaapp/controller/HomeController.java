package com.qazaapp.qazaapp.controller;

import com.qazaapp.qazaapp.model.LastTime;
import com.qazaapp.qazaapp.model.Prayer;
import com.qazaapp.qazaapp.repository.ILastTimeRepository;
import com.qazaapp.qazaapp.repository.IPrayerRepository;
import com.qazaapp.qazaapp.repository.PrayerRepository;
import com.qazaapp.qazaapp.repository.TimeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    IPrayerRepository iPrayerRepository;
    ILastTimeRepository iLastTimeRepository;

    public HomeController() {

        iPrayerRepository = new PrayerRepository();
        iLastTimeRepository = new TimeRepository();
    }


    @GetMapping("/")
    public String homePage(Model model){

        model.addAttribute("list", iPrayerRepository.getAll());


        return "homePage";
    }

    @GetMapping ("/registerPrayers")
    public String register(){



    return "registerPrayer";
}

    @PostMapping("/created")
    public String created(@ModelAttribute Prayer prayer, @ModelAttribute LastTime lastTime){

        iPrayerRepository.createQaza(prayer);

        iLastTimeRepository.createTime(lastTime);


        return "redirect:/";
    }

   @GetMapping ("/prayers{id}")
   public String prayers(@PathVariable("id") int prayer_id, Model model){

        Prayer prayer = iPrayerRepository.readQaza(prayer_id);

        model.addAttribute("prayer_id", prayer.getPrayer_id());
        model.addAttribute("fajr", prayer.getFajr());
        model.addAttribute("zuhr", prayer.getZuhr());
        model.addAttribute("ashr", prayer.getAshr());
        model.addAttribute("maghrib", prayer.getMaghrib());
        model.addAttribute("isha", prayer.getIsha());

        return "Prayers";
   }

   @PostMapping ("updated")
    public String update(@ModelAttribute Prayer prayer){

        iPrayerRepository.updateQaza(prayer);

        return "redirect:/prayers";
   }


}
