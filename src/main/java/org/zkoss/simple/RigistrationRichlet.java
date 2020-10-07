package org.zkoss.simple;


import org.zkoss.zk.ui.*;
import org.zkoss.zul.*;

public class RigistrationRichlet extends GenericRichlet {
	public void service(Page page) throws Exception {
		//create components dynamically
		Window window = new Window("Welcome! New User", "normal", false);
		window.setWidth("400px");
		Button button = new Button("Save");
		window.appendChild(button);
		window.setPage(page);
	}
}
