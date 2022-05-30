package br.com.enums;

public enum WorkerLevel {

	JUNIOR("Junior"), MID_LEVEL("Mid Level"), SENIOR("Senior");
	
	String key;
	
	WorkerLevel(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
