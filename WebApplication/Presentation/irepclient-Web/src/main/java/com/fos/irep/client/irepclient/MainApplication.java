/*
 * Copyright 2009 IT Mill Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.fos.irep.client.irepclient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.HttpServletRequestListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MainApplication extends Application implements HttpServletRequestListener {
	
	/**
	 * 
	 */
	protected static ThreadLocal<MainApplication> thisApplication = new ThreadLocal<MainApplication>();
    private Window window;

    @Override
    public void init()
    {
        window = new Window("My Vaadin Application");
        setMainWindow(window);
        Button button = new Button("Click Me");
        button.addListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                window.addComponent(new Label("Thank you for clicking"));
            }
        });
        window.addComponent(button);
        
    }

	public void onRequestStart(HttpServletRequest request,
			HttpServletResponse response) {
		 MainApplication.setInstance(this);
		
	}

	public void onRequestEnd(HttpServletRequest request,
			HttpServletResponse response) {
		thisApplication.remove();
		
	}
	
	 /**
     * Get instance of MainApplication associated with current session.
     * The user's MainApplication is always tied to the current thread and can be looked up by calling getInstance().
     *
     * @return MainApplication associated with user's session
     */
    public static MainApplication getInstance() {
        return thisApplication.get();
    }

    private static void setInstance(MainApplication application) {
        if (getInstance() == null) {
        	thisApplication.set(application);
        }
    }



    
}
