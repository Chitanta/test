package com.briup.ooad.day03.work01;


public class Adapter extends Action implements Work {

	@Override
	public void doStart() {
		
	}

	@Override
	public void doRun() {
		run();

	}

	@Override
	public void doEnd() {

	}

	public void go(Work work) {
		work.doRun();
	}

}
