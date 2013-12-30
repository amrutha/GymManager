package org.ancit.gymmanager.ui.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class GymManagerPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView("org.ancit.gymmanager.ui.views.GymDetailsView", IPageLayout.LEFT, 0.5f, IPageLayout.ID_EDITOR_AREA);
		layout.addView("org.ancit.gymmanager.ui.views.MemberDetailsView", IPageLayout.RIGHT, 0.56f, "org.ancit.gymmanager.ui.views.GymDetailsView");
	}

}
