package org.ancit.gymmanager.ui.filter;

import org.ancit.gymmanager.model.Member;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class SearchFilter extends ViewerFilter {
	String searchText;

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		// TODO Auto-generated method stub
		if (element instanceof Member) {
			Member member = (Member) element;
			if (searchText == null || searchText.length() == 0) {
				return true;
			}
			if (member.getName().toLowerCase().contains(searchText)
					|| member.getMobileNo().toLowerCase().contains(searchText)) {
				return true;
			}

		}
		return false;
	}

	public void setSearch(String searchText) {
		// TODO Auto-generated method stub
		this.searchText = searchText.toLowerCase();

	}

}
