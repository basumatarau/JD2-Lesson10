package by.htp.lesson.main;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {
	private String name = "John Smith";
	private int age = 32;
	private float height = 1.778f;
	private boolean programmer = true;
	private Long ageinSeconds = 1009843200L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	public Long getAgeinSeconds() {
		return ageinSeconds;
	}
	public void setAgeinSeconds(Long ageinSeconds) {
		this.ageinSeconds = ageinSeconds;
	}
	

}
