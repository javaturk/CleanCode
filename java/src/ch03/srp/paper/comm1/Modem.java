
package org.javaturk.cc.ch03.srp.paper.comm1;

public interface Modem {

	public void dial(String pno);

	public void hangup();

	public void send(char c);

	public char recv();
}
