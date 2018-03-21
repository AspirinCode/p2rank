import cz.siret.prank.program.params.Params

/**
 *  config for peptide binding residue prediction
 */
(params as Params).with {

    /**
     * define this if you want dataset program parameters to be evaluated relative to this directory
     * (set absolute path or path relative to install dir, null defaults to working dir)
     */
    dataset_base_dir = "../../p2rank-datasets2/peptides/sprint17"

    /**
     * all output of the prorgam will be stored in subdirectores of this directory
     * (set absolute path or path relative to install dir, null defaults to working dir)
     */
    output_base_dir = "../../p2rank-results-pept/${version}"


    predict_residues = true

    visualizations = false

    fail_fast = true

    load_only_specified_chains = true

    vis_generate_proteins = true

    log_to_file = false

    //

    residue_score_threshold = 2.45d

    //

    classifier="FasterForest"

    atom_table_feat_keep_sgn = true

    atom_table_features = ["ap5sasaValids","ap5sasaInvalids","apRawValids","apRawInvalids","atomicHydrophobicity"]

    extra_features = ["chem","volsite","protrusion","bfactor"]

    residue_table_features = ["RAx"]

    avg_weighted = true

    average_feat_vectors = true

    balance_class_weights = true

    target_class_weight_ratio = 0.053

    solvent_radius = 1.8


    // technical

    cache_datasets = true

    clear_sec_caches = false

    clear_prim_caches = false

    log_level = "WARN"


}
