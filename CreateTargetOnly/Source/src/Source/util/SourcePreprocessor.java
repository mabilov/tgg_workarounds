package Source.util;

import java.util.Stack;

import org.eclipse.emf.common.util.EList;

import Source.Element;
import Source.SourceModel;
import Source.SplitMerge;

public class SourcePreprocessor {
	private static Element _findFirst(SourceModel model) {
		EList<Element> els = model.getElements();
		for (Element el : els) {
			boolean first = true;
			for (Element el1 : els) {
				if (el1.getNext() == el) {
					first = false;
					break;
				}
			}
			if (first) {
				return el;
			}
		}
		return null;
	}

	public static void preprocessSource(SourceModel model) {
		Element firstEl = _findFirst(model);
		Element el = firstEl;

		Stack<SplitMerge> splits = new Stack<SplitMerge>();
		while (el != null) {
			if (el instanceof SplitMerge) {
				if (!((SplitMerge) el).isMerge()) {
					splits.push((SplitMerge) el);
				} else {
					splits.pop().set__con((SplitMerge) el);
				}
			}
			el = el.getNext();
		}

	}
}
