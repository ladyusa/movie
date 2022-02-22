package ku.movie.controller;

import ku.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @GetMapping("/movie")
    public String getRestaurantPage(Model model) {
        model.addAttribute("movies", repository.findAll());
        return "movie";
    }
}
