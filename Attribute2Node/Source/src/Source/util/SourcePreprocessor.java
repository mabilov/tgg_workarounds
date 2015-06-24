package Source.util;

import Source.Element;
import Source.SourceFactory;
import Source.SourceModel;
import Source._SpecialAttrType;

public class SourcePreprocessor {
	public static void preprocess(SourceModel sm) {
		for (Element e : sm.getElements()) {
			if (e.getSpecialAttr() != null && !e.getSpecialAttr().isEmpty()) {
				_SpecialAttrType t = SourceFactory.eINSTANCE
						.create_SpecialAttrType();
				t.setValue(e.getSpecialAttr());
				e.setSpecialAttr(null);
				e.set_special(t);
			}
		}
	}
}