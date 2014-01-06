package org.ancit.gymmanager.ui.views;

import org.ancit.gymmanager.model.PlanData;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class MemberDetailsViewLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		String str ="N/A";
		if (element instanceof PlanData) {
			PlanData planData = (PlanData) element;
			 
			switch (columnIndex) {
			case 0: str = planData.getPlanType();
				break;
			case 1: str = planData.getStartDate().toString();
			break;
			case 2: str = planData.getEndDate().toString();
			break;
			case 3: str = planData.getPlanStatus();
			break;
			case 4: str = Integer.toString(planData.getBillNo());
			break;
			case 5: str = Double.toString(planData.getAmountPaid());
			break;
			
			default:
				break;
			}
		}
		return str;
	}

}
