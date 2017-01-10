package cz.siret.prank.features.implementation

import cz.siret.prank.features.api.AtomFeatureCalculationContext
import cz.siret.prank.features.api.AtomFeatureCalculator
import org.biojava.nbio.structure.Atom

/**
 * Simple single value Atom feature that adds B-factor (temperature factor) from PDB to Atom feature vector.
 */
class BfactorFeature extends AtomFeatureCalculator {

    @Override
    String getName() {
        "bfactor"
    }

    @Override
    double[] calculateForAtom(Atom proteinSurfaceAtom, AtomFeatureCalculationContext protein) {
        double value = proteinSurfaceAtom.tempFactor
        return [value] as double[]
    }

}
