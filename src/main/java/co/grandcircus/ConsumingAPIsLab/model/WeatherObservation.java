package co.grandcircus.ConsumingAPIsLab.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherObservation {
	private String id;
	private String name;
	private String elev;
	private String latitude;
	private String longitude;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Temp")
	private String temp;
	@JsonProperty("Dewp")
	private String dewp;
	@JsonProperty("Relh")
	private String relh;
	@JsonProperty("Winds")
	private String winds;
	@JsonProperty("Windd")
	private String windd;
	@JsonProperty("Gust")
	private String gust;
	@JsonProperty("Weather")
	private String weather;
	@JsonProperty("Weatherimage")
	private String weatherImage;
	@JsonProperty("Visibility")
	private String visibility;
	@JsonProperty("Altimeter")
	private String altimeter;
	@JsonProperty("SLP")
	private String slp;
	private String timezone;
	private String state;
	@JsonProperty("WindChill")
	private String windChill;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElev() {
		return elev;
	}
	public void setElev(String elev) {
		this.elev = elev;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getDewp() {
		return dewp;
	}
	public void setDewp(String dewp) {
		this.dewp = dewp;
	}
	public String getRelh() {
		return relh;
	}
	public void setRelh(String relh) {
		this.relh = relh;
	}
	public String getWinds() {
		return winds;
	}
	public void setWinds(String winds) {
		this.winds = winds;
	}
	public String getWindd() {
		return windd;
	}
	public void setWindd(String windd) {
		this.windd = windd;
	}
	public String getGust() {
		return gust;
	}
	public void setGust(String gust) {
		this.gust = gust;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWeatherImage() {
		return weatherImage;
	}
	public void setWeatherImage(String weatherImage) {
		this.weatherImage = weatherImage;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public String getAltimeter() {
		return altimeter;
	}
	public void setAltimeter(String altimeter) {
		this.altimeter = altimeter;
	}
	public String getSlp() {
		return slp;
	}
	public void setSlp(String slp) {
		this.slp = slp;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getWindChill() {
		return windChill;
	}
	public void setWindChill(String windChill) {
		this.windChill = windChill;
	}
	
}
