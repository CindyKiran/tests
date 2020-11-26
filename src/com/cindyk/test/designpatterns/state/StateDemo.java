package com.cindyk.test.designpatterns.state;

public class StateDemo {
	public static void main(String[] args) {
		WeatherCondition weather = new WeatherCondition();
		weather.alertWeatherForcast();
		weather.setCurrentWeather(new CodeOrange());
		weather.alertWeatherForcast();
		weather.setCurrentWeather(new CodeRed());
		weather.alertWeatherForcast();

/*		String codeRed = "red";
		String codeOrange = "orange";

		Demo demo = new Demo();
		demo.setCurrentWeather(codeOrange);
		String currentWeather = demo.getCurrentWeather();
		if(currentWeather.equals(codeRed)){
			System.out.println("Tornado upcoming, mandatory to stay at home");
		} else if(currentWeather.equals(codeOrange)){
			System.out.println("Hard storm upcoming; advised to stay at home");
		} else {
			System.out.println("Weather is good. No need to alert the citizen");
		}*/
	}
}
