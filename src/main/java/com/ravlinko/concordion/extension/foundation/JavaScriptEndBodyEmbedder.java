package com.ravlinko.concordion.extension.foundation;

import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;

import org.concordion.api.listener.DocumentParsingListener;
import org.concordion.internal.util.Check;

public class JavaScriptEndBodyEmbedder implements DocumentParsingListener {
	private final String javaScript;

	JavaScriptEndBodyEmbedder(String javaScript) {
		this.javaScript = javaScript;
	}

	@Override
	public void beforeParsing(Document document) {
		Element html = document.getRootElement();
		Element body = html.getFirstChildElement("body");
		Check.notNull(body, "<body> section is missing from document");
		Element script = new Element("script");
		script.addAttribute(new Attribute("type", "text/javascript") );
		script.appendChild(javaScript);
		body.insertChild(script, body.getChildCount());
	}
}
