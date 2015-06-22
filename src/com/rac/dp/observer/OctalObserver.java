package com.rac.dp.observer;

public class OctalObserver implements Observer {

	@Override
	public void update(final Observable o) {
		if (o instanceof Subject) {
			System.err.println("Octal observer " + ((Subject) o).getState());
		}
	}
}
