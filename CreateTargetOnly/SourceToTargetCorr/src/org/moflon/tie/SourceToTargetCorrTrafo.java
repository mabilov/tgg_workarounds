package org.moflon.tie;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EObject;
import org.moflon.ide.debug.DebugSynchronizationHelper;

import Source.SourceModel;
import Source.util.SourcePreprocessor;
import SourceToTargetCorr.SourceToTargetCorrPackage;

public class SourceToTargetCorrTrafo extends DebugSynchronizationHelper {

	public SourceToTargetCorrTrafo() {
		super(SourceToTargetCorrPackage.eINSTANCE, ".");
	}

	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		// Forward Transformation
		SourceToTargetCorrTrafo helper = new SourceToTargetCorrTrafo();
		helper.performForward("instances/v2/fwd.src.xmi");

		// Backward Transformation
		// helper = new SourceToTargetCorrTrafo();
		// helper.performBackward("instances/bwd.src.xmi");
	}

	public void performForward() {
		SourcePreprocessor.preprocessSource((SourceModel) this.src);
		integrateForward();

		saveTrg("instances/v2/fwd.trg.xmi");
		saveCorr("instances/v2/fwd.corr.xmi");
		saveSynchronizationProtocol("instances/v2/fwd.protocol.xmi");

		System.out.println("Completed forward transformation!");
	}

	public void performForward(EObject srcModel) {
		setSrc(srcModel);
		performForward();
	}

	public void performForward(String source) {
		try {
			loadSrc(source);
			performForward();
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load " + source + ", "
					+ iae.getMessage());
			return;
		}
	}

	public void performBackward() {
		integrateBackward();

		saveSrc("instances/bwd.trg.xmi");
		saveCorr("instances/bwd.corr.xmi");
		saveSynchronizationProtocol("instances/bwd.protocol.xmi");

		System.out.println("Completed backward transformation!");
	}

	public void performBackward(EObject targetModel) {
		setTrg(targetModel);
		performBackward();
	}

	public void performBackward(String target) {
		try {
			loadTrg(target);
			performBackward();
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load " + target + ", "
					+ iae.getMessage());
			return;
		}
	}
}