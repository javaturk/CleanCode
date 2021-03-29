package org.javaturk.cc.ch03.isp.log.good;

import java.io.File;

public interface DBLogger extends Logger {

	void openConnection();

	void closeConnection();
}
