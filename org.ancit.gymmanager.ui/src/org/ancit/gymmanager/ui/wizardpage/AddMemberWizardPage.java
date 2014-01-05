package org.ancit.gymmanager.ui.wizardpage;

import org.ancit.gymmanager.model.Member;
import org.ancit.gymmanager.model.PlanData;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class AddMemberWizardPage extends WizardPage {
	private Text name;
	private Text id;
	private Text address;
	private Text phNo;
	private Text photo;
	private Text admittedBy;
	Combo status;
	Combo combo, combo_1;
	String fileName;

	/**
	 * Create the wizard.
	 */
	public AddMemberWizardPage() {
		super("wizardPage");
		setTitle("Adds New Member to Gym");
		setDescription("This wizard is used to add New Member to your Gym.");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite startdate = new Composite(parent, SWT.NULL);

		setControl(startdate);
		startdate.setLayout(new GridLayout(4, false));

		Label lblCustomerId = new Label(startdate, SWT.NONE);
		lblCustomerId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblCustomerId.setText("Member Id :");

		id = new Text(startdate, SWT.BORDER | SWT.READ_ONLY);
		id.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		id.setText("MEM-" + Member.getCount());

		Button btnAddPhoto = new Button(startdate, SWT.NONE);
		btnAddPhoto.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(Display.getDefault()
						.getActiveShell(), SWT.TITLE | SWT.OPEN);
				fileDialog.setText("Upload Files");
				fileDialog
						.setFilterNames(new String[] { "Images(*.jpg;*.jpeg;*.png;*.gif)" });
				fileDialog
						.setFilterExtensions(new String[] { "*.jpg;*.jpeg;*.png;*.gif" });
				fileDialog.open();
				fileName = fileDialog.getFilterPath()
						+ System.getProperty("file.separator")
						+ fileDialog.getFileName();
				photo.setText(fileName);
			}
		});
		btnAddPhoto.setText("Add Photo");

		photo = new Text(startdate, SWT.BORDER | SWT.READ_ONLY);
		photo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));

		Label lblCustomerName = new Label(startdate, SWT.NONE);
		lblCustomerName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblCustomerName.setText("Member Name :");

		name = new Text(startdate, SWT.BORDER);
		name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		ModifyListener modifyListener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		};
		name.addModifyListener(modifyListener);

		Label lblStatus = new Label(startdate, SWT.NONE);
		lblStatus.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblStatus.setText("Status :");

		status = new Combo(startdate, SWT.READ_ONLY);
		status.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		String[] memberStatus = { PlanData.ACTIVE_STATUS,
				PlanData.INACTIVE_STATUS };
		status.setItems(memberStatus);
		status.select(0);

		Label lblAddress_1 = new Label(startdate, SWT.NONE);
		lblAddress_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblAddress_1.setText("Address");

		address = new Text(startdate, SWT.BORDER);
		address.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		address.addModifyListener(modifyListener);

		Label label = new Label(startdate, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		label.setText("Plan :");

		combo = new Combo(startdate, SWT.READ_ONLY);
		combo.setItems(new String[] { PlanData.PLAN_TYPE_MONTHLY,
				PlanData.PLAN_TYPE_QUARTERLY, PlanData.PLAN_TYPE_HALF_YEARLY,
				PlanData.PLAN_TYPE_YEARLY });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		combo.select(0);

		Label lblPhoneNo = new Label(startdate, SWT.NONE);
		lblPhoneNo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblPhoneNo.setText("Mobile No :");

		phNo = new Text(startdate, SWT.BORDER);
		phNo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		phNo.addModifyListener(modifyListener);

		Label label_1 = new Label(startdate, SWT.NONE);
		label_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		label_1.setText("Category :");

		combo_1 = new Combo(startdate, SWT.READ_ONLY);
		combo_1.setItems(new String[] { "General", "Student" });
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		combo_1.select(0);

		Label lblAdmittedBy = new Label(startdate, SWT.NONE);
		lblAdmittedBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblAdmittedBy.setText("Admitted By :");

		admittedBy = new Text(startdate, SWT.BORDER);
		admittedBy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		admittedBy.addModifyListener(modifyListener);

		setPageComplete(false);

	}

	private void validate() {

		if (name.getText().equals("")) {
			setErrorMessage("Enter Member name.");
		} else if (address.getText().equals("")) {
			setErrorMessage("Enter Address.");
		} else if (phNo.getText().equals("")) {
			setErrorMessage("Enter Mobile Number.");
		} else if (admittedBy.getText().equals("")) {
			setErrorMessage("Enter Admitted By.");
		} 
		else {
			setErrorMessage(null);
			setPageComplete(true);
		}

	}

	@Override
	public String getName() {
		return name.getText();
	}

	public String getId() {
		return id.getText();
	}

	public String getPhNo() {
		return phNo.getText();
	}

	public String getAddress() {
		return address.getText();
	}

	public String getAdmittedBy() {
		return admittedBy.getText();
	}

	public String getStatus() {
		return status.getText();
	}

	public String getPlan() {
		return combo.getText();
	}

	public String getCategory() {
		return combo_1.getText();

	}

	public String getPhoto() {
		return photo.getText();
	}


}
