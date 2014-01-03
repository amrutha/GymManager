package org.ancit.gymmanager.ui.views;

import org.ancit.gymmanager.model.Member;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class GymDetailsLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		String val = "AAA";

		if (element instanceof Member) {
			Member member = (Member) element;
			switch (columnIndex) {
			case 0:
				val = member.getId();
				break;
			case 1:
				val = member.getName();
				break;
			case 2:
				val = member.getMobileNo();
				break;
			// case 3: val =
			// member.getLastPlanDetails().getStartDate().toString();
			// break;
			// case 4: val =
			// member.getLastPlanDetails().getEndDate().toString();
			// break;
			 case 5: val = member.getAdmittedBy();
			 break;
			default:
				val = "Hello";
				break;
			}
			return val;
		}
		return super.getText(element);
	}

}
