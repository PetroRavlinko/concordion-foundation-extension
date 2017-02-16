package com.ravlinko.concordion.extension.foundation;

import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

public class ZurbFoundationExtension  implements ConcordionExtension {

	@Override
	public void addTo(ConcordionExtender concordionExtender) {
		concordionExtender.withLinkedCSS("/foundation.min.css", new Resource("/foundation.min.css"));

		concordionExtender.withLinkedJavaScript("/jquery.js", new Resource("/jquery.js"));
		concordionExtender.withLinkedJavaScript("/foundation.min.js", new Resource("/foundation.min.js"));
		concordionExtender.withLinkedJavaScript("/what-input.js", new Resource("/what-input.js"));

		concordionExtender.withDocumentParsingListener(new JavaScriptEndBodyEmbedder("$(document).foundation()"));
	}
}
