package org.ancit.gymmanager.ui.wizardpage;

import java.util.Date;

import org.ancit.gymmanager.model.PlanData;
import org.eclipse.core.internal.preferences.StringPool;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;

public class AddPlanDetailsWizardPage extends WizardPage {
	private Text txtBillno;
	private Text txtAmountpaid;
	private Combo planTypeCombo;
	private Combo statusCombo;
	private DateTime startDate;
	private DateTime endDate;

	/**
	 * Create the wizard.
	 */
	public AddPlanDetailsWizardPage() {
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label label = new Label(container, SWT.NONE);
		label.setText("Bill No : ");
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		txtBillno = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		txtBillno.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtBillno.setText("1");
		
		Label lblPlanType = new Label(container, SWT.NONE);
		lblPlanType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPlanType.setText("Plan Type : ");
		
		planTypeCombo = new Combo(container, SWT.READ_ONLY);
		planTypeCombo.setItems(new String[] {PlanData.PLAN_TYPE_MONTHLY, PlanData.PLAN_TYPE_QUARTERLY,PlanData.PLAN_TYPE_HALF_YEARLY,PlanData.PLAN_TYPE_YEARLY});
		planTypeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		planTypeCombo.select(0);
		
		Label lblPlanStatus = new Label(container, SWT.NONE);
		lblPlanStatus.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPlanStatus.setText("Plan Status : ");
		
		statusCombo = new Combo(container, SWT.READ_ONLY);
		statusCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		statusCombo.setItems(new String[]{PlanData.ACTIVE_STATUS,PlanData.INACTIVE_STATUS});
		statusCombo.select(0);
		
		Label lblAmountPaid = new Label(container, SWT.NONE);
		lblAmountPaid.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAmountPaid.setText("Amount Paid : ");
		
		txtAmountpaid = new Text(container, SWT.BORDER);
		txtAmountpaid.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblStartDate = new Label(container, SWT.NONE);
		lblStartDate.setText("Start Date : ");
		
		startDate = new DateTime(container, SWT.BORDER);
		
		Label lblEndDate = new Label(container, SWT.NONE);
		lblEndDate.setText("End Date : ");
		
		endDate = new DateTime(container, SWT.BORDER);
	}

	public int getTxtBillno() {
		return Integer.parseInt(txtBillno.getText());
	}

	public Double getTxtAmountpaid() {
		return Double.parseDouble(txtAmountpaid.getText());
	}

	public String getPlanTypeCombo() {
		return planTypeCombo.getText();
	}

	public String getStatusCombo() {
		return statusCombo.getText();
	}

	public Date getStartDate() {
		return new Date(startDate.getDay()+"/"+startDate.getMonth()+1+"/"+startDate.getYear());
	}

	public Date getEndDate() {
		return new Date(endDate.getDay()+"/"+endDate.getMonth()+"/"+endDate.getYear());
	}

}
