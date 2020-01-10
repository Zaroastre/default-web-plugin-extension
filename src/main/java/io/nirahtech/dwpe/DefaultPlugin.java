package io.nirahtech.dwpe;

import io.nirahtech.waphs.Plugin;

public class DefaultPlugin extends Plugin {
	public DefaultPlugin() {
		super();
	}
	
	@Override
	public void load() {
		System.out.println("Loading for " + DefaultPlugin.class.getSimpleName());
		super.load();
	}
	

}
