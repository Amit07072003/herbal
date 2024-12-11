package com.example.herbalgarden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.herbalgarden.Entity.User;
import com.example.herbalgarden.model.Plant;
import com.example.herbalgarden.model.PlantDetail;
import com.example.herbalgarden.service.PlantDetailService;
import com.example.herbalgarden.service.PlantService;
import com.example.herbalgarden.service.UserService;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PlantService plantService;

    
    @Autowired
    private PlantDetailService plantDetailService;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // This should resolve to /WEB-INF/views/register.jsp
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user){
        System.out.println(user);
      User u=  userService.saveUser(user);
      if(u!=null) {
    	  System.out.println("save sucess");
    	  
      }else {
    	  
    	  System.out.println("Error in server"); 
      }
        return ("redirect:/login"); // Redirect to login page after successful registration
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // This will resolve to /WEB-INF/views/login.jsp
    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute User user,HttpSession session,Model m) {
//        
//        
//        return "login";
//    }

    @GetMapping("/user/home")
    public String showHomePage(@RequestParam(defaultValue = "1") int page,
                               @RequestParam(defaultValue = "30") int size,
                               Model model) {
        // Fetch paginated data from the service
        PlantService.ApiResponse paginatedPlants = plantService.getPlants(page, size);
        model.addAttribute("plants", paginatedPlants.getData());
        model.addAttribute("currentPage", paginatedPlants.getCurrent_page());
        model.addAttribute("totalPages", paginatedPlants.getLast_page());

        
        
       


        
        return "home"; // Redirect to login if not authenticated
        }
    
    @GetMapping("/plantDetail/{id}")
    public String showPlantDetail(@PathVariable("id") String plantId, Model model) {
        // Fetch plant details using the plantId
        PlantDetail plantDetail = plantDetailService.getPlantDetailsById(plantId);
       
        
        // Log the plantDetail to check if it's not null and has data
//   System.out.println(plantDetail.getPruningCount().getInterval());
        
        // Add plant details to the model to display on the plantDetail.jsp page
        model.addAttribute("plantDetail", plantDetail);  // Use "plant" in the model attribute name
        

        // Return the name of the JSP page
        return "plantDetail";
    }
    
    
    
    
  @GetMapping("/searchPlant")
    public String searchPlant(@RequestParam String plantName, Model model) {
        Plant plant = plantService.searchPlant(plantName);
        if (plant != null) {
            model.addAttribute("plants", List.of(plant));
        } else {
            model.addAttribute("plants", List.of());
        }
        return "home"; // Return the name of your JSP page
    }

    

    
}
