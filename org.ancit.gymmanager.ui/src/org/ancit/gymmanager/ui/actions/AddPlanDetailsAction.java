package org.ancit.gymmanager.ui.actions;

import org.ancit.gymmanager.model.Member;
import org.ancit.gymmanager.ui.views.MemberDetailsView;
import org.ancit.gymmanager.ui.wizards.AddPlanDetailsWizard;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class AddPlanDetailsAction implements IViewActionDelegate {

	private Member member;

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		if (member != null) {
			AddPlanDetailsWizard wizard = new AddPlanDetailsWizard(member);
			WizardDialog wdDialog = new WizardDialog(Display.getDefault()
					.getActiveShell(), wizard);
			wdDialog.open();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

		if (selection instanceof Member) {
			member = (Member) selection;
		}
	}

	@Override
	public void init(IViewPart view) {
		// TODO Auto-generated method stub
		if (view instanceof MemberDetailsView) {
			MemberDetailsView memberDetailsView = (MemberDetailsView) view;
			member = memberDetailsView.getMember();
			
		}

	}

}
