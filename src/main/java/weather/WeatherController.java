package weather;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.google.gson.Gson;


@Controller
public class WeatherController  {


	@GetMapping("/")
	public String start(Model model,Weather weather) {
	//weather.setCityName(cityName);
	//model.addAttribute("cityName", cityName);
	return "pogoda_start";
	}

	@PostMapping("/")
	public String setVariable(Model model, Weather weather) {
		model.addAttribute("cityName", weather.cityName);
		weather.setCityName(weather.cityName);
		return "redirect:/pogoda/";
	}
	
	
	@GetMapping("pogoda/")
	public String WeatherModel(Model model,Weather weather) throws IOException{
	model.addAttribute("cityName", weather.getCityName().toUpperCase());
	URL url = new URL("https://goweather.herokuapp.com/weather/"+weather.getCityName());
	InputStreamReader reader = new InputStreamReader(url.openStream());
	weather = new Gson().fromJson(reader, Weather.class);
	//model.addAttribute("cityName", weather.toUpperCase());
	model.addAttribute("todayTemp", weather.getTemperature());
	model.addAttribute("todayWind", weather.getWind());
	model.addAttribute("todayDesc", weather.getDescription());
	model.addAttribute("d1Temp", weather.getForecast().get(0).getTemperature());
	model.addAttribute("d1Wind", weather.getForecast().get(0).getWind());
	model.addAttribute("d2Temp", weather.getForecast().get(1).getTemperature());
	model.addAttribute("d2Wind", weather.getForecast().get(1).getWind());
	model.addAttribute("d3Temp", weather.getForecast().get(2).getTemperature());
	model.addAttribute("d3Wind", weather.getForecast().get(2).getWind());
	return "Pogoda";
	
	}

	
}
