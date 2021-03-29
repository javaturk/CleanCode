package org.javaturk.cc.ch03.ocp.factory.solution;

public class ManagerFactory implements Factory{

	@Override
	public Manager create() {
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment(), EmployeeRandomizer.createDepartment());
		return manager;
	}
}
