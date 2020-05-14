package tutorial;


import org.zkoss.zk.ui.*;
import org.zkoss.zk.ui.select.*;
import org.zkoss.zk.ui.select.annotation.*;
import org.zkoss.zul.*;
import org.zkoss.zul.ext.*;

import java.util.*;

public class SearchController extends SelectorComposer<Component> {

    private static final long serialVersionUID = 1L;

    @Wire
    private Textbox keywordBox;
    @Wire
    private Listbox carListbox;
    @Wire
    private Label modelLabel;
    @Wire
    private Label makeLabel;
    @Wire
    private Label priceLabel;
    @Wire
    private Label descriptionLabel;
    @Wire
    private Image previewImage;

    private ListModelList<Car> dataModel = new ListModelList<>();
    private CarService carService = new CarServiceImpl();

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        carListbox.setModel(dataModel);
    }

    @Listen("onClick = #searchButton; onOK = window")
    public void search() {
        String keyword = keywordBox.getValue();
        dataModel.clear();
        dataModel.addAll(carService.search(keyword));
    }

    @Listen("onSelect = #carListbox")
    public void showDetail() {
        Set<Car> selection = dataModel.getSelection();
        Car selected = selection.iterator().next();
        previewImage.setSrc(selected.getPreview());
        modelLabel.setValue(selected.getModel());
        makeLabel.setValue(selected.getMake());
        priceLabel.setValue(selected.getPrice().toString());
        descriptionLabel.setValue(selected.getDescription());
    }
}
