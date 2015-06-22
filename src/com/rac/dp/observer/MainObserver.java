package com.rac.dp.observer;

public class MainObserver {

	public static void main(final String[] args) {

		final Subject subject = new Subject();
		final OctalObserver octalObserver = new OctalObserver();
		final BinaryObserver binaryObserver = new BinaryObserver();
		subject.attach(octalObserver);
		subject.attach(binaryObserver);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);

		subject.dettach(binaryObserver);
		System.out.println("Second state change: 25");
		subject.setState(25);

	}

}
