package com.castroantonio.selenium.controller;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

public class MainPageController {

	private String name;
	private String output;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	@Command
	@NotifyChange("output")
	public void submit() {
		output = "Hello " + name + "!!!";
		System.out.println("Button 'Submit' has been clicked!");
		System.out.println("Name in the TextBox: " + name + ".");
	}
}