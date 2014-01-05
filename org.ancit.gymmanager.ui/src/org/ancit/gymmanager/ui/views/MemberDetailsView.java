package org.ancit.gymmanager.ui.views;

import org.ancit.gymmanager.model.Member;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;

public class MemberDetailsView extends ViewPart implements ISelectionListener {

	public static final String ID = "org.ancit.gymmanager.ui.views.MemberDetailsView"; //$NON-NLS-1$
	private final FormToolkit formToolkit = new FormToolkit(
			Display.getDefault());
	private Text txtId;
	private Text txtName;
	private Text txtMobileno;
	private Text txtAddress;
	private Text txtBloodgroup;
	Button btnPhotoUnavailable;
	private Table table;
	private TableViewer planDataTableViewer;

	public MemberDetailsView() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		Composite composite = formToolkit.createComposite(container, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));
		composite.setBounds(0, 0, 64, 64);
		formToolkit.paintBordersFor(composite);
		{
			Section sctnMemberDetails = formToolkit.createSection(composite,
					Section.TWISTIE | Section.TITLE_BAR);
			sctnMemberDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, false, 1, 1));
			formToolkit.paintBordersFor(sctnMemberDetails);
			sctnMemberDetails.setText("Member Details ");
			sctnMemberDetails.setExpanded(true);
			{
				Composite composite_1 = new Composite(sctnMemberDetails,
						SWT.NONE);
				formToolkit.adapt(composite_1);
				formToolkit.paintBordersFor(composite_1);
				sctnMemberDetails.setClient(composite_1);
				composite_1.setLayout(new GridLayout(3, false));
				{
					Label lblMemberId = formToolkit.createLabel(composite_1,
							"Member Id : ", SWT.NONE);
					lblMemberId.setLayoutData(new GridData(SWT.RIGHT,
							SWT.CENTER, false, false, 1, 1));
				}
				{
					txtId = formToolkit.createText(composite_1, "New Text",
							SWT.NONE);
					txtId.setText("");
					GridData gd_txtId = new GridData(SWT.FILL, SWT.CENTER,
							false, false, 1, 1);
					gd_txtId.widthHint = 216;
					txtId.setLayoutData(gd_txtId);
				}
				{
					btnPhotoUnavailable = new Button(composite_1, SWT.NONE);
					GridData gd_btnPhotoUnavailable = new GridData(SWT.FILL,
							SWT.FILL, false, false, 1, 5);
					gd_btnPhotoUnavailable.widthHint = 213;
					gd_btnPhotoUnavailable.heightHint = 30;
					btnPhotoUnavailable.setLayoutData(gd_btnPhotoUnavailable);
					btnPhotoUnavailable
							.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {

								}
							});
					formToolkit.adapt(btnPhotoUnavailable, true, true);
					btnPhotoUnavailable.setText("Photo Unavailable");
				}
				{
					Label lblNewLabel_1 = formToolkit.createLabel(composite_1,
							"Name : ", SWT.NONE);
					lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT,
							SWT.CENTER, false, false, 1, 1));
				}
				{
					txtName = new Text(composite_1, SWT.BORDER);
					txtName.setText("name");
					GridData gd_txtName = new GridData(SWT.FILL, SWT.CENTER,
							true, false, 1, 1);
					gd_txtName.heightHint = 40;
					txtName.setLayoutData(gd_txtName);
					formToolkit.adapt(txtName, true, true);
				}
				{
					Label lblMobileNo = formToolkit.createLabel(composite_1,
							"Mobile No : ", SWT.NONE);
					lblMobileNo.setLayoutData(new GridData(SWT.RIGHT,
							SWT.CENTER, false, false, 1, 1));
				}
				{
					txtMobileno = new Text(composite_1, SWT.BORDER);
					txtMobileno.setText("MobileNo");
					txtMobileno.setLayoutData(new GridData(SWT.FILL,
							SWT.CENTER, true, false, 1, 1));
					formToolkit.adapt(txtMobileno, true, true);
				}
				{
					Label lblNewLabel = new Label(composite_1, SWT.NONE);
					lblNewLabel.setLayoutData(new GridData(SWT.RIGHT,
							SWT.CENTER, false, false, 1, 1));
					formToolkit.adapt(lblNewLabel, true, true);
					lblNewLabel.setText("Address : ");
				}
				{
					txtAddress = new Text(composite_1, SWT.BORDER);
					txtAddress.setText("address");
					GridData gd_txtAddress = new GridData(SWT.FILL, SWT.CENTER,
							true, false, 1, 1);
					gd_txtAddress.heightHint = 70;
					txtAddress.setLayoutData(gd_txtAddress);
					formToolkit.adapt(txtAddress, true, true);
				}

				Label lblStatus = new Label(composite_1, SWT.NONE);
				lblStatus.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
						false, false, 1, 1));
				formToolkit.adapt(lblStatus, true, true);
				lblStatus.setText("BloodGroup : ");
				{
					txtBloodgroup = new Text(composite_1, SWT.BORDER);
					txtBloodgroup.setText("bloodgroup");
					txtBloodgroup.setLayoutData(new GridData(SWT.FILL,
							SWT.CENTER, true, false, 1, 1));
					formToolkit.adapt(txtBloodgroup, true, true);
				}

			}
		}
		{
			Section sctnPlanDet = formToolkit.createSection(composite,
					Section.TWISTIE | Section.TITLE_BAR);
			sctnPlanDet.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true, 1, 1));
			formToolkit.paintBordersFor(sctnPlanDet);
			sctnPlanDet.setText("Plan Details");
			sctnPlanDet.setExpanded(true);
			{
				Composite composite_1 = new Composite(sctnPlanDet, SWT.NONE);
				formToolkit.adapt(composite_1);
				formToolkit.paintBordersFor(composite_1);
				sctnPlanDet.setClient(composite_1);
				composite_1.setLayout(new GridLayout(1, false));
				{
					planDataTableViewer = new TableViewer(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
					table = planDataTableViewer.getTable();
					table.setLinesVisible(true);
					table.setHeaderVisible(true);
					table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
					formToolkit.paintBordersFor(table);
					{
						TableViewerColumn tableViewerColumn = new TableViewerColumn(planDataTableViewer, SWT.NONE);
						TableColumn tblclmnPlantype = tableViewerColumn.getColumn();
						tblclmnPlantype.setWidth(86);
						tblclmnPlantype.setText("PlanType");
					}
					{
						TableViewerColumn tableViewerColumn = new TableViewerColumn(planDataTableViewer, SWT.NONE);
						TableColumn tblclmnStartDate = tableViewerColumn.getColumn();
						tblclmnStartDate.setWidth(100);
						tblclmnStartDate.setText("Start Date");
					}
					{
						TableViewerColumn tableViewerColumn = new TableViewerColumn(planDataTableViewer, SWT.NONE);
						TableColumn tblclmnEndDate = tableViewerColumn.getColumn();
						tblclmnEndDate.setWidth(100);
						tblclmnEndDate.setText("End Date");
					}
					{
						TableViewerColumn tableViewerColumn = new TableViewerColumn(planDataTableViewer, SWT.NONE);
						TableColumn tblclmnstatus = tableViewerColumn.getColumn();
						tblclmnstatus.setWidth(52);
						tblclmnstatus.setText("Status");
					}
					{
						TableViewerColumn tableViewerColumn = new TableViewerColumn(planDataTableViewer, SWT.NONE);
						TableColumn tblclmnBillNo = tableViewerColumn.getColumn();
						tblclmnBillNo.setWidth(60);
						tblclmnBillNo.setText("Bill No");
					}
					{
						TableViewerColumn tableViewerColumn = new TableViewerColumn(planDataTableViewer, SWT.NONE);
						TableColumn tblclmnAmountPaid = tableViewerColumn.getColumn();
						tblclmnAmountPaid.setWidth(100);
						tblclmnAmountPaid.setText("Amount Paid");
					}
					planDataTableViewer.setContentProvider(new GymDetailsContentProvider());
					planDataTableViewer.setLabelProvider(new MemberDetailsViewLabelProvider());
				}
			}
		}

		getSite().getPage().addSelectionListener(this);

	}

	public void setFocus() {
		// Set the focus
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection strucSel = (IStructuredSelection) selection;
			Object firstElement = strucSel.getFirstElement();
			if (firstElement instanceof Member) {
				Member member = (Member) firstElement;
				// System.out.println(member.getName());
				txtId.setText(member.getId());
				txtName.setText(member.getName());
				txtAddress.setText(member.getAddress());
				txtMobileno.setText(member.getMobileNo());
				// txtBloodgroup.setText(member.getBloodGroup());
				Image image = null;
				if (member.getPhotoStatus() == true) {
					image = new Image(Display.getDefault(),
							System.getProperty("user.dir")
									+ System.getProperty("file.separator")
									+ "Images"
									+ System.getProperty("file.separator")
									+ member.getId() + "_" + member.getName()
									+ ".jpg");
				}

				btnPhotoUnavailable.setImage(image);

			}
		}
	}
}
