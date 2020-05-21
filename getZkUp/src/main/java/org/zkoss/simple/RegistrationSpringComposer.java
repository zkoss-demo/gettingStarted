package org.zkoss.simple;


import org.slf4j.*;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.*;
import org.zkoss.zul.*;

@SuppressWarnings("serial")
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class RegistrationSpringComposer extends SelectorComposer<Window> {

	@Wire("#submitButton")
	private Button submitButton;
	@Wire("#nameBox")
	private Textbox nameBox;
	@Wire("#genderRadio")
	private Radiogroup genderRadio;
	@Wire("#birthdayBox")
	private Datebox birthdayBox;
	@Wire("#acceptTermBox")
	private Checkbox acceptTermCheckbox;
	
	@WireVariable
	private RegistrationDao registrationDao;
	
	private static Logger logger = LoggerFactory.getLogger(RegistrationSpringComposer.class.getName());
	private LegacyRegister legacyRegister = new LegacyRegister();
	
	
	@Listen("onCheck = #acceptTermBox")
	public void changeSubmitStatus(){
		if (acceptTermCheckbox.isChecked()){
			submitButton.setDisabled(false);
			submitButton.setIconSclass("z-icon-check");
		}else{
			submitButton.setDisabled(true);
			submitButton.setIconSclass("");
		}
	}
	
	@Listen("onClick = #resetButton")
	public void reset(){
		//set raw value to avoid triggering constraint error message
		nameBox.setRawValue("");
		genderRadio.setSelectedIndex(0);
		birthdayBox.setRawValue(null);
		acceptTermCheckbox.setChecked(false);
		submitButton.setDisabled(true);
	}
	

	@Listen("onClick = #submitButton")
	public void submit(){
		if (!validateInput()){
			logger.debug("input validation failed");
			return;
		}

		User newUser = new User();
		newUser.setName(nameBox.getValue());
		if (genderRadio.getSelectedIndex()==0){
			newUser.setMale(true);
		}else{
			newUser.setMale(false);
		}
		newUser.setBirthday(birthdayBox.getValue());
		registrationDao.add(newUser);
//		legacyRegister.add(newUser);

		Messagebox.show("Congratulation! "+nameBox.getValue()+". Your registration is success.");
		reset();
	}
	
	private boolean validate(User user){
		return true;
	}
	private boolean validateInput(){
		if (nameBox.getValue().length()==0){
			return false;
		}
		
		if (birthdayBox.getValue()==null){
			return false;
		}
	
		return true;
	}
}
