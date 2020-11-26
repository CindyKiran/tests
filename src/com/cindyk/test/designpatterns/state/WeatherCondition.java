package com.cindyk.test.designpatterns.state;

//Context
public class WeatherCondition {
	private CodeWeather currentWeather;

	public WeatherCondition() {
		//set it to default weather state
		this.currentWeather = new CodeGreen();
	}

	public void setCurrentWeather(CodeWeather currentWeather) {
		this.currentWeather = currentWeather;
	}

	public void alertWeatherForcast(){
		currentWeather.alert();
	}
}
