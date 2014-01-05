package org.ancit.gymmanager.ui.wizards;

import java.awt.Graphics2D;
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
	private static final int IMG_WIDTH = 200;
	private static final int IMG_HEIGHT = 200;

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
		Member.incrementCounter();
		member.setName(page.getName());
		member.setId(page.getId());
		member.setAddress(page.getAddress());
		member.setMobileNo(page.getPhNo());
		// member.setPhotoStatus(page.getPhoto());
		member.setCategory(page.getCategory());
		member.setIdCardStatus(page.getStatus());
		member.setAdmittedBy(page.getAdmittedBy());
		String imageURL = page.getPhoto();
		if (!imageURL.isEmpty()) {
			try {
				BufferedImage imageIO = ImageIO.read(new URL("file:///"
						+ imageURL));
				int type = imageIO.getType() == 0 ? BufferedImage.TYPE_INT_ARGB
						: imageIO.getType();

				BufferedImage resizeImageJpg = resizeImage(imageIO, type);
				ImageIO.write(
						resizeImageJpg,
						"jpg",
						new File(System.getProperty("user.dir")
								+ System.getProperty("file.separator")
								+ "Images"
								+ System.getProperty("file.separator")
								+ page.getId() + "_" + page.getName() + ".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		record.addMemberToGym(member);

		return true;
	}

	private BufferedImage resizeImage(BufferedImage imageIO, int type) {
		// TODO Auto-generated method stub
		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT,
				type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(imageIO, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();

		return resizedImage;
	}

}
