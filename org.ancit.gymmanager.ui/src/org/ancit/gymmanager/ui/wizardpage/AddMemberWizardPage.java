package org.ancit.gymmanager.ui.wizardpage;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
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
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
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
		lblCustomerId.setText("Customer Id :");

		id = new Text(startdate, SWT.BORDER);
		id.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button btnAddPhoto = new Button(startdate, SWT.NONE);
		btnAddPhoto.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(Display.getDefault()
						.getActiveShell(), SWT.TITLE | SWT.OPEN);
				fileDialog.setText("Upload Files");
				// ((Object) fileDialog).setAutoUpload( true ); // This API will
				// change, see below!
				fileDialog.open();
				fileName = fileDialog.getFilterPath()
						+ System.getProperty("file.separator")
						+ fileDialog.getFileName();
				photo.setText(fileName);
			}
		});
		btnAddPhoto.setText("Add Photo");

		photo = new Text(startdate, SWT.BORDER);
		photo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));

		Label lblCustomerName = new Label(startdate, SWT.NONE);
		lblCustomerName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblCustomerName.setText("Customer Name :");

		name = new Text(startdate, SWT.BORDER);
		name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblStatus = new Label(startdate, SWT.NONE);
		lblStatus.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblStatus.setText("Status :");

		status = new Combo(startdate, SWT.NONE);
		status.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		String[] memberStatus = { "Active", "In-Active" };
		status.setItems(memberStatus);

		Label lblAddress_1 = new Label(startdate, SWT.NONE);
		lblAddress_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblAddress_1.setText("Address");

		address = new Text(startdate, SWT.BORDER);
		address.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Label label = new Label(startdate, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		label.setText("Plan :");

		combo = new Combo(startdate, SWT.NONE);
		combo.setItems(new String[] { "Monthly", "Quaterly", "Half Yearly",
				"Yearly" });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));

		Label lblPhoneNo = new Label(startdate, SWT.NONE);
		lblPhoneNo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblPhoneNo.setText("Phone No :");

		phNo = new Text(startdate, SWT.BORDER);
		phNo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label label_1 = new Label(startdate, SWT.NONE);
		label_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		label_1.setText("Category :");

		combo_1 = new Combo(startdate, SWT.NONE);
		combo_1.setItems(new String[] { "General", "Student" });
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Label lblAdmittedBy = new Label(startdate, SWT.NONE);
		lblAdmittedBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblAdmittedBy.setText("Admitted By :");

		admittedBy = new Text(startdate, SWT.BORDER);
		admittedBy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		new Label(startdate, SWT.NONE);
		new Label(startdate, SWT.NONE);
		// endDate.setText(dateTime.getDay());

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
