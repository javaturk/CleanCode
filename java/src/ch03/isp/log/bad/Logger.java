package org.javaturk.cc.ch03.isp.log.bad;

import java.io.File;

import org.javaturk.cc.ch03.isp.log.Log;

public interface Logger {

	void log(Log log);

	void openConnection();

	void closeConnection();

	void openFile(File file, boolean create);

	void closeFile();

}
