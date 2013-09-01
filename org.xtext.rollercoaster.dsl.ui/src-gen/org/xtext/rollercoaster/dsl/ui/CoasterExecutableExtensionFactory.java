/*
 * generated by Xtext
 */
package org.xtext.rollercoaster.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.rollercoaster.dsl.ui.internal.CoasterActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CoasterExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CoasterActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CoasterActivator.getInstance().getInjector(CoasterActivator.ORG_XTEXT_ROLLERCOASTER_DSL_COASTER);
	}
	
}