package com.ecodation.oop2;

public class Bayan extends GenelOrtakOzellikler implements IBayanFarklıOzellikler {
	private static final long serialVersionUID = 1L;

	@Override
	public void govdesizMetot() {
		System.out.println("Bayan Classındaki method");

	}

	@Override
	public void guzellikler() {
		System.out.println("Bayan: güzellikler");

	}

}
