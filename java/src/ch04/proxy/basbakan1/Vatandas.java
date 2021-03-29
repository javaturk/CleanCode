
package org.javaturk.cc.ch04.proxy.basbakan1;

public class Vatandas {
	private Basbakan basbakan = new Basbakan();

	public String derdiniAnlat() {
		basbakan.dertDinle("Bir derdim var...");
		return "Yasasiiinnn!!!";
	}

	public String isIste() {
		basbakan.isBul("Oglum");
		return "Yasasiiinnn!!!";
	}
}
