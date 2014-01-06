package org.ancit.gymmanager.ui.wizards;

import org.ancit.gymmanager.model.Member;
import org.ancit.gymmanager.model.PlanData;
import org.ancit.gymmanager.ui.wizardpage.AddPlanDetailsWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class AddPlanDetailsWizard extends Wizard {

	private AddPlanDetailsWizardPage planDetailsPage;
	private Member member;

	public AddPlanDetailsWizard() {
		setWindowTitle("New Wizard");
	}
	
	public AddPlanDetailsWizard(Member member) {
		this.member = member;
		setWindowTitle("New Wizard");
	}

	@Override
	public void addPages() {
		planDetailsPage = new AddPlanDetailsWizardPage();
		addPage(planDetailsPage);
	}

	@Override
	public boolean performFinish() {
		PlanData planData = new PlanData();
		planData.setBillNo(planDetailsPage.getTxtBillno());
		planData.setPlanType(planDetailsPage.getPlanTypeCombo());
		planData.setPlanStatus(planDetailsPage.getStatusCombo());
		planData.setAmountPaid(planDetailsPage.getTxtAmountpaid());
		planData.setStartDate(planDetailsPage.getStartDate());
		planData.setEndDate(planDetailsPage.getEndDate());

		member.addToPlanDetails(planData);
		
		return true;
	}

}
