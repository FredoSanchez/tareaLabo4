package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	@AssertTrue(message="Quien te crees que eres, regresa a la pagina anterior solo los humanos pueden agregar productos")
	private Boolean soyRobot;

	public Robot() {
		super();
	}

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
}
