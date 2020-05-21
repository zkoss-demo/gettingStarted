package org.zkoss.tutorial;


import com.google.api.services.customsearch.model.Result;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.*;
import org.zkoss.zul.*;

@SuppressWarnings("serial")
public class SearchComposer extends SelectorComposer<Window> {


	@Wire("#keywordBox")
	private Textbox keywordBox;
//	@Wire("#result")
//	private Label resultLabel;
	@Wire("#resultGrid")
	private Grid resultGrid;
	
	private CustomSearchService searchService = new CustomSearchService();
	
	@Listen("onClick = #searchButton; onOK = div")
	public void search(){
		resultGrid.setModel(new SimpleListModel<Result>(searchService.search(keywordBox.getValue())));
		
	}
}
