package com.ravlinko.concordion.extension.foundation;

import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

public class ZurbFoundationExtension  implements ConcordionExtension {

	@Override
	public void addTo(ConcordionExtender concordionExtender) {
		concordionExtender.withLinkedCSS("/foundation/foundation.min.css", new Resource("/foundation/foundation.min.css"));

		concordionExtender.withLinkedJavaScript("/foundation/jquery.js", new Resource("/foundation/jquery.js"));
		concordionExtender.withLinkedJavaScript("/foundation/foundation.min.js", new Resource("/foundation/foundation.min.js"));
		concordionExtender.withLinkedJavaScript("/foundation/what-input.js", new Resource("/foundation/what-input.js"));

		concordionExtender.withDocumentParsingListener(new JavaScriptEndBodyEmbedder("$(document).foundation()"));
	}
}
