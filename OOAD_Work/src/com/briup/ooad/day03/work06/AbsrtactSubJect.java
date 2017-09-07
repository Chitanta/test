package com.briup.ooad.day03.work06;

import java.util.List;
import java.util.ArrayList;

public abstract class AbsrtactSubJect implements Subject {

	private List<Observer> list = new ArrayList<Observer>();

	@Override
	public void add(Observer observer) {
		list.add(observer);

	}

	@Override
	public void del(Observer observer) {
		list.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : list) {
			observer.updata();
		}

	}

}
