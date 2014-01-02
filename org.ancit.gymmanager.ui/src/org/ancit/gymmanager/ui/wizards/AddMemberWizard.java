package org.ancit.gymmanager.ui.wizards;

import org.ancit.gymmanager.model.GymManager;
import org.ancit.gymmanager.model.GymRecord;
import org.ancit.gymmanager.model.Member;
import org.ancit.gymmanager.ui.wizardpage.AddMemberWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class AddMemberWizard extends Wizard {
	AddMemberWizardPage page;
	GymRecord record = GymManager.getGymManager().getRecord();

	public AddMemberWizard() {
		setWindowTitle("New Wizard");
	}

	@Override
	public void addPages() {
		page = new AddMemberWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {

		Member member = new Member();
		member.setName(page.getName());
		member.setId(page.getId());
		member.setAddress(page.getAddress());
		member.setMobileNo(page.getPhNo());
		member.setPhotoStatus(page.getPhoto());
		member.setCategory(page.getCategory());
		member.setIdCardStatus(page.getStatus());

		record.addMemberToGym(member);

		return true;
	}

}
