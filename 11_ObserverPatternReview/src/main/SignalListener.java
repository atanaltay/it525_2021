package main;

import java.util.EventListener;

//Funcgional Interface
public interface SignalListener extends EventListener{

	public void colorChanged(SignalEventObject evt);
}
