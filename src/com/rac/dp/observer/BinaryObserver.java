package com.rac.dp.observer;

public class BinaryObserver implements Observer {

	@Override
	public void update(final Observable o) {
		if (o instanceof Subject) {
			System.err.println("Binary observer " + ((Subject) o).getState());
		}
	}

}
