package org.ancit.gymmanager.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class SuperSaver implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5599700568137668276L;
	public static final String ACTIVE_STATUS = "active";
	public static final String INACTIVE_STATUS = "inActive";
	

	PropertyChangeSupport listeners = new PropertyChangeSupport(this);

	public void addPropertyChangeListeners(PropertyChangeListener listener) {
		listeners.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListeners(PropertyChangeListener listener) {
		listeners.removePropertyChangeListener(listener);
	}

	public void firePropertyChange(String propertyName, Object oldValue,
			Object newValue) {
		listeners.firePropertyChange(propertyName, oldValue, newValue);
	}

}
