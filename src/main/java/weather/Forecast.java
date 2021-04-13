package weather;






	import java.util.HashMap;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"day",
	"temperature",
	"wind"
	})
	@Generated("jsonschema2pojo")
	public class Forecast {

	@JsonProperty("day")
	private String day;
	@JsonProperty("temperature")
	private String temperature;
	@JsonProperty("wind")
	private String wind;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("day")
	public String getDay() {
	return day;
	}

	@JsonProperty("day")
	public void setDay(String day) {
	this.day = day;
	}

	@JsonProperty("temperature")
	public String getTemperature() {
	return temperature;
	}

	@JsonProperty("temperature")
	public void setTemperature(String temperature) {
	this.temperature = temperature;
	}

	@JsonProperty("wind")
	public String getWind() {
	return wind;
	}

	@JsonProperty("wind")
	public void setWind(String wind) {
	this.wind = wind;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}

