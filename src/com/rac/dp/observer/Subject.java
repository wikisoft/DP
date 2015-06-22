package com.rac.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {

	private final List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(final int state) {
		this.state = state;
		notifyAllObservers();
	}

	@Override
	public void notifyAllObservers() {
		for (final Observer observer : observers) {
			observer.update(this);
		}
	}

	@Override
	public void attach(final Observer observer) {
		observers.add(observer);
	}

	@Override
	public void dettach(final Observer observer) {
		observers.remove(observer);
	}

}
