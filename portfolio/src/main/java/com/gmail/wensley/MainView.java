package com.gmail.wensley;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
	 * 
	 */
/**
	 * 
	 */

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin", shortName = "Project Base")
public class MainView extends VerticalLayout {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1255168230997114647L;

	public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button);
        
        Image image = new Image("/webapp/unnamed.jpg", "DummyImage");
        add(image);
        
    }
    

}
