package com.anaplan.srm.entity;

public class Guest {
	
	private String guestName;
	private String guestDateOfBirth;
	private String guestCountry;
	private String guestLanguage;
	private String guestHobby;

	private boolean lovesMusicAndDance;
	private boolean lovesToDrink;
	private int age;
	private boolean speaksChinese;
	private boolean lovesToRead;
	private boolean lovesPlayingSports;
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guest(String guestName, String guestDateOfBirth, String guestCountry, String guestLanguage,
			String guestHobby, boolean lovesMusicAndDance, boolean lovesToDrink, int age, boolean speaksChinese,
			boolean lovesToRead, boolean lovesPlayingSports) {
		super();
		this.guestName = guestName;
		this.guestDateOfBirth = guestDateOfBirth;
		this.guestCountry = guestCountry;
		this.guestLanguage = guestLanguage;
		this.guestHobby = guestHobby;
		this.lovesMusicAndDance = lovesMusicAndDance;
		this.lovesToDrink = lovesToDrink;
		this.age = age;
		this.speaksChinese = speaksChinese;
		this.lovesToRead = lovesToRead;
		this.lovesPlayingSports = lovesPlayingSports;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestDateOfBirth() {
		return guestDateOfBirth;
	}
	public void setGuestDateOfBirth(String guestDateOfBirth) {
		this.guestDateOfBirth = guestDateOfBirth;
	}
	public String getGuestCountry() {
		return guestCountry;
	}
	public void setGuestCountry(String guestCountry) {
		this.guestCountry = guestCountry;
	}
	public String getGuestLanguage() {
		return guestLanguage;
	}
	public void setGuestLanguage(String guestLanguage) {
		this.guestLanguage = guestLanguage;
	}
	public String getGuestHobby() {
		return guestHobby;
	}
	public void setGuestHobby(String guestHobby) {
		this.guestHobby = guestHobby;
	}
	public boolean isLovesMusicAndDance() {
		return lovesMusicAndDance;
	}
	public void setLovesMusicAndDance(boolean lovesMusicAndDance) {
		this.lovesMusicAndDance = lovesMusicAndDance;
	}
	public boolean isLovesToDrink() {
		return lovesToDrink;
	}
	public void setLovesToDrink(boolean lovesToDrink) {
		this.lovesToDrink = lovesToDrink;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSpeaksChinese() {
		return speaksChinese;
	}
	public void setSpeaksChinese(boolean speaksChinese) {
		this.speaksChinese = speaksChinese;
	}
	public boolean isLovesToRead() {
		return lovesToRead;
	}
	public void setLovesToRead(boolean lovesToRead) {
		this.lovesToRead = lovesToRead;
	}
	public boolean isLovesPlayingSports() {
		return lovesPlayingSports;
	}
	public void setLovesPlayingSports(boolean lovesPlayingSports) {
		this.lovesPlayingSports = lovesPlayingSports;
	}
	@Override
	public String toString() {
		return "Guest [guestName=" + guestName + ", guestDateOfBirth=" + guestDateOfBirth + ", guestCountry="
				+ guestCountry + ", guestLanguage=" + guestLanguage + ", guestHobby=" + guestHobby
				+ ", lovesMusicAndDance=" + lovesMusicAndDance + ", lovesToDrink=" + lovesToDrink + ", age=" + age
				+ ", speaksChinese=" + speaksChinese + ", lovesToRead=" + lovesToRead + ", lovesPlayingSports="
				+ lovesPlayingSports + "]";
	}
}
