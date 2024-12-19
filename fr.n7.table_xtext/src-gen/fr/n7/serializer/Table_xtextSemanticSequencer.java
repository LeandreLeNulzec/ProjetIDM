/*
 * generated by Xtext 2.32.0
 */
package fr.n7.serializer;

import com.google.inject.Inject;
import fr.n7.services.Table_xtextGrammarAccess;
import fr.n7.table_xtext.Argument;
import fr.n7.table_xtext.Bloc_Binaire;
import fr.n7.table_xtext.Bloc_Fonction;
import fr.n7.table_xtext.Bloc_Unaire;
import fr.n7.table_xtext.Colonne;
import fr.n7.table_xtext.ColonneDerivee;
import fr.n7.table_xtext.ColonneProvient;
import fr.n7.table_xtext.Constante;
import fr.n7.table_xtext.Et;
import fr.n7.table_xtext.Ou;
import fr.n7.table_xtext.PredicatColonne;
import fr.n7.table_xtext.PredicatValeur;
import fr.n7.table_xtext.Script;
import fr.n7.table_xtext.Table;
import fr.n7.table_xtext.Table_xtextPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Table_xtextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Table_xtextGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Table_xtextPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Table_xtextPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case Table_xtextPackage.BLOC_BINAIRE:
				sequence_Bloc_Binaire(context, (Bloc_Binaire) semanticObject); 
				return; 
			case Table_xtextPackage.BLOC_FONCTION:
				sequence_Bloc_Fonction(context, (Bloc_Fonction) semanticObject); 
				return; 
			case Table_xtextPackage.BLOC_UNAIRE:
				sequence_Bloc_Unaire(context, (Bloc_Unaire) semanticObject); 
				return; 
			case Table_xtextPackage.COLONNE:
				sequence_Colonne(context, (Colonne) semanticObject); 
				return; 
			case Table_xtextPackage.COLONNE_DERIVEE:
				sequence_ColonneDerivee(context, (ColonneDerivee) semanticObject); 
				return; 
			case Table_xtextPackage.COLONNE_PROVIENT:
				sequence_ColonneProvient(context, (ColonneProvient) semanticObject); 
				return; 
			case Table_xtextPackage.CONSTANTE:
				sequence_Constante(context, (Constante) semanticObject); 
				return; 
			case Table_xtextPackage.ET:
				sequence_Et(context, (Et) semanticObject); 
				return; 
			case Table_xtextPackage.OU:
				sequence_Ou(context, (Ou) semanticObject); 
				return; 
			case Table_xtextPackage.PREDICAT_COLONNE:
				sequence_PredicatColonne(context, (PredicatColonne) semanticObject); 
				return; 
			case Table_xtextPackage.PREDICAT_VALEUR:
				sequence_PredicatValeur(context, (PredicatValeur) semanticObject); 
				return; 
			case Table_xtextPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			case Table_xtextPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ScriptElements returns Argument
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     entree=[Colonne|ID]
	 * </pre>
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.ARGUMENT__ENTREE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.ARGUMENT__ENTREE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentAccess().getEntreeColonneIDTerminalRuleCall_1_0_1(), semanticObject.eGet(Table_xtextPackage.Literals.ARGUMENT__ENTREE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ScriptElements returns Bloc_Binaire
	 *     Bloc returns Bloc_Binaire
	 *     Bloc_Binaire returns Bloc_Binaire
	 *
	 * Constraint:
	 *     operation=binaire
	 * </pre>
	 */
	protected void sequence_Bloc_Binaire(ISerializationContext context, Bloc_Binaire semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.BLOC_BINAIRE__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.BLOC_BINAIRE__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBloc_BinaireAccess().getOperationBinaireEnumRuleCall_1_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ScriptElements returns Bloc_Fonction
	 *     Bloc returns Bloc_Fonction
	 *     Bloc_Fonction returns Bloc_Fonction
	 *
	 * Constraint:
	 *     operation=fonction
	 * </pre>
	 */
	protected void sequence_Bloc_Fonction(ISerializationContext context, Bloc_Fonction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.BLOC_FONCTION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.BLOC_FONCTION__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBloc_FonctionAccess().getOperationFonctionEnumRuleCall_1_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ScriptElements returns Bloc_Unaire
	 *     Bloc returns Bloc_Unaire
	 *     Bloc_Unaire returns Bloc_Unaire
	 *
	 * Constraint:
	 *     operation=unaire
	 * </pre>
	 */
	protected void sequence_Bloc_Unaire(ISerializationContext context, Bloc_Unaire semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.BLOC_UNAIRE__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.BLOC_UNAIRE__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBloc_UnaireAccess().getOperationUnaireEnumRuleCall_1_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Colonnes returns ColonneDerivee
	 *     ColonneDerivee returns ColonneDerivee
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         indice=INT 
	 *         script=[Script|ID] 
	 *         colonnesEntrees+=[Colonne|ID]* 
	 *         elementType=ColonneElementType 
	 *         contraintes=Contrainte? 
	 *         nbLignes=INT
	 *     )
	 * </pre>
	 */
	protected void sequence_ColonneDerivee(ISerializationContext context, ColonneDerivee semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Colonnes returns ColonneProvient
	 *     ColonneProvient returns ColonneProvient
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         indice=INT 
	 *         tableOrigin=Table 
	 *         refColonne=ID 
	 *         elementType=ColonneElementType 
	 *         contraintes=Contrainte? 
	 *         nbLignes=INT
	 *     )
	 * </pre>
	 */
	protected void sequence_ColonneProvient(ISerializationContext context, ColonneProvient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Colonnes returns Colonne
	 *     Colonne returns Colonne
	 *
	 * Constraint:
	 *     (name=ID indice=INT elementType=ColonneElementType contraintes=Contrainte? nbLignes=INT)
	 * </pre>
	 */
	protected void sequence_Colonne(ISerializationContext context, Colonne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ScriptElements returns Constante
	 *     Constante returns Constante
	 *
	 * Constraint:
	 *     val=FLOAT
	 * </pre>
	 */
	protected void sequence_Constante(ISerializationContext context, Constante semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.CONSTANTE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.CONSTANTE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstanteAccess().getValFLOATTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Contrainte returns Et
	 *     Et returns Et
	 *
	 * Constraint:
	 *     variables+=[Contrainte|ID]+
	 * </pre>
	 */
	protected void sequence_Et(ISerializationContext context, Et semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Contrainte returns Ou
	 *     Ou returns Ou
	 *
	 * Constraint:
	 *     variables+=[Contrainte|ID]+
	 * </pre>
	 */
	protected void sequence_Ou(ISerializationContext context, Ou semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Contrainte returns PredicatColonne
	 *     Predicat returns PredicatColonne
	 *     PredicatColonne returns PredicatColonne
	 *
	 * Constraint:
	 *     (condition=Condition colonne=[Colonnes|ID])
	 * </pre>
	 */
	protected void sequence_PredicatColonne(ISerializationContext context, PredicatColonne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.PREDICAT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.PREDICAT__CONDITION));
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.PREDICAT_COLONNE__COLONNE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.PREDICAT_COLONNE__COLONNE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPredicatColonneAccess().getConditionConditionEnumRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getPredicatColonneAccess().getColonneColonnesIDTerminalRuleCall_3_0_1(), semanticObject.eGet(Table_xtextPackage.Literals.PREDICAT_COLONNE__COLONNE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Contrainte returns PredicatValeur
	 *     Predicat returns PredicatValeur
	 *     PredicatValeur returns PredicatValeur
	 *
	 * Constraint:
	 *     (condition=Condition valeur=FLOAT)
	 * </pre>
	 */
	protected void sequence_PredicatValeur(ISerializationContext context, PredicatValeur semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.PREDICAT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.PREDICAT__CONDITION));
			if (transientValues.isValueTransient(semanticObject, Table_xtextPackage.Literals.PREDICAT_VALEUR__VALEUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Table_xtextPackage.Literals.PREDICAT_VALEUR__VALEUR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPredicatValeurAccess().getConditionConditionEnumRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getPredicatValeurAccess().getValeurFLOATTerminalRuleCall_3_0(), semanticObject.getValeur());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Script returns Script
	 *
	 * Constraint:
	 *     (name=ID entrees+=[Colonne|ID]* scriptElements+=ScriptElements*)
	 * </pre>
	 */
	protected void sequence_Script(ISerializationContext context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=ID colonnes+=Colonnes* colonneID=[Colonne|ID] scripts+=Script*)
	 * </pre>
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
