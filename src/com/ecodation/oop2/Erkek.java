package com.ecodation.oop2;

public class Erkek extends GenelOrtakOzellikler implements IErkekFarklıOzellikler {
	private static final long serialVersionUID = 1360118166602038894L;

	@Override
	public void govdesizMetot() {
		System.out.println("Erkek Classındaki method");
	}

	@Override
	public void guc() {
		System.out.println("Power: 500");

	}

}
