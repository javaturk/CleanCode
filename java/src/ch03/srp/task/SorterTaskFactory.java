package org.javaturk.cc.ch03.srp.task;

public class SorterTaskFactory {

	public Sorter<Product> create() {
		return new SorterTask();
	}
}
