package org.ancit.gymmanager.ui.wizards;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

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

		Member member = page.getMember();
		member.setName(page.getName());
		member.setId(page.getId());
		member.setAddress(page.getAddress());
		member.setMobileNo(page.getPhNo());
		// member.setPhotoStatus(page.getPhoto());
		member.setCategory(page.getCategory());
		member.setIdCardStatus(page.getStatus());
//		member.setPhotoStatus(page.getPhoto());
		String imageURL = page.getPhoto();

		try {
			BufferedImage imageIO = ImageIO
					.read(new URL("file:///" + imageURL));
			ImageIO.write(
					imageIO,
					"png",
					new File(System.getProperty("user.dir")
							+ System.getProperty("file.separator") + "Images"
							+ System.getProperty("file.separator")
							+ page.getId() + page.getName() + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		record.addMemberToGym(member);

		return true;
	}

}
