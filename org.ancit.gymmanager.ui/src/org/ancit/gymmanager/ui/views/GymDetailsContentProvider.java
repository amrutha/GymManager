package org.ancit.gymmanager.ui.views;

import org.ancit.gymmanager.model.GymRecord;
import org.ancit.gymmanager.model.Member;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class GymDetailsContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof GymRecord) {
			GymRecord gymRecord = (GymRecord) inputElement;
			return gymRecord.getMembers().toArray();
		}
		if(inputElement instanceof Member)
		{
			Member member = (Member) inputElement;
			return member.getPlanDetails().toArray();
		}

		return new Object[0];
	}

}
