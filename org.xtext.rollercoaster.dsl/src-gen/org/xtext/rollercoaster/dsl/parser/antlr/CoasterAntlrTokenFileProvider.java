/*
* generated by Xtext
*/
package org.xtext.rollercoaster.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CoasterAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/rollercoaster/dsl/parser/antlr/internal/InternalCoaster.tokens");
	}
}
