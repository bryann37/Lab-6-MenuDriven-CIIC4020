package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object arg) {
		// TODO Auto-generated method stub
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nRemoving a new list of Integer values to the system:\n"); 
		String listName = io.getInput("\nEnter name of new list: "); 
		dm.removeList(listName);

	}

}
