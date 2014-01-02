package org.ancit.gymmanager.ui.actions;

import org.ancit.gymmanager.ui.wizards.AddMemberWizard;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class AddMemberAction implements IViewActionDelegate {

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		WizardDialog dialog = new WizardDialog(Display.getDefault()
				.getActiveShell(), new AddMemberWizard());
		dialog.open();

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IViewPart view) {
		// TODO Auto-generated method stub

	}

}
