package com.briup.ooad.day03.work06;

public interface Subject {
	public void add(Observer observer);

	public void del(Observer observer);

	public void notifyObservers();

	public void operator();
}
