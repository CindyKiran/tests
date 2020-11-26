package com.cindyk.test.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

//Subject
public class MinistryOfMagic {
	List<Media> mediaChannels = new ArrayList<>();

	//the state of the subject
	private List<String> newsTopics = new ArrayList<>();

	public void addObserver(Media media){
		mediaChannels.add(media);
	}

	public void removeObserver(Media media){
		mediaChannels.remove(media);
	}

	public void addNews(String message){
		newsTopics.add(message);
	}
	public void spreadNews(){
		mediaChannels.forEach(media -> media.update(this.newsTopics));
	}
}
