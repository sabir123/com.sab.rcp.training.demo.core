package com.sab.rcp.training.demo.core;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {
//		layout.setEditorAreaVisible(true);
			layout.setFixed(true);
	}
}
