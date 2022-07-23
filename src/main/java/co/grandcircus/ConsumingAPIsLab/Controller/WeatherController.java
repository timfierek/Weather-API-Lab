package co.grandcircus.ConsumingAPIsLab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.ConsumingAPIsLab.model.WeatherResponse;
import co.grandcircus.ConsumingAPIsLab.service.WeatherApiService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherApiService weatherService;
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@PostMapping("/location-submit")
	public String showWeather(Model model, @RequestParam String lat, @RequestParam String lon) {
		WeatherResponse curWeather = weatherService.getCurWeather(lat, lon);
		
		model.addAttribute("areaDescription", curWeather.getLocationInfo().getAreaDescription());
		model.addAttribute("temp", curWeather.getObservation().getTemp());
		model.addAttribute("winds", curWeather.getObservation().getWinds());
		model.addAttribute("visibility", curWeather.getObservation().getVisibility());
		model.addAttribute("futureForecasts", curWeather.getDataInfo().getText());
		model.addAttribute("forecastLabels", curWeather.getTimeInfo().getStartPeriodName());
		
		return "weatherdisplay";
	}
}
