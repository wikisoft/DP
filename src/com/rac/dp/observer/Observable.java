package com.rac.dp.observer;

public interface Observable {

	public void attach(Observer observer);

	public void dettach(Observer observer);

	public void notifyAllObservers();

}
