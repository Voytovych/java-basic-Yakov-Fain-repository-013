package com.voytovych.ejb;

import javax.ejb.Local;

@Local
public interface Greeting {
	  public String sayHello();
}
