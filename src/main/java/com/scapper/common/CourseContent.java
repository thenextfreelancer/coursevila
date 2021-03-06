package com.scapper.common;

public class CourseContent {
	
	private int id;
	
	private int courseId;
	
	private int hourDuration;
	
	private int noOfDownloadableResources;
	
	private int noOfLectures;
	
	private int sections;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getHourDuration() {
		return hourDuration;
	}

	public void setHourDuration(int hourDuration) {
		this.hourDuration = hourDuration;
	}

	public int getNoOfDownloadableResources() {
		return noOfDownloadableResources;
	}

	public void setNoOfDownloadableResources(int noOfDownloadableResources) {
		this.noOfDownloadableResources = noOfDownloadableResources;
	}

	public int getNoOfLectures() {
		return noOfLectures;
	}

	public void setNoOfLectures(int noOfLectures) {
		this.noOfLectures = noOfLectures;
	}

	public int getSections() {
		return sections;
	}

	public void setSections(int sections) {
		this.sections = sections;
	}
	
}
