/**
 */
package table.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import table.util.TableAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableItemProviderAdapterFactory extends TableAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link table.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.Colonne} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneItemProvider colonneItemProvider;

	/**
	 * This creates an adapter for a {@link table.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColonneAdapter() {
		if (colonneItemProvider == null) {
			colonneItemProvider = new ColonneItemProvider(this);
		}

		return colonneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.ColonneProvient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneProvientItemProvider colonneProvientItemProvider;

	/**
	 * This creates an adapter for a {@link table.ColonneProvient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColonneProvientAdapter() {
		if (colonneProvientItemProvider == null) {
			colonneProvientItemProvider = new ColonneProvientItemProvider(this);
		}

		return colonneProvientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.ColonneDerivee} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneDeriveeItemProvider colonneDeriveeItemProvider;

	/**
	 * This creates an adapter for a {@link table.ColonneDerivee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColonneDeriveeAdapter() {
		if (colonneDeriveeItemProvider == null) {
			colonneDeriveeItemProvider = new ColonneDeriveeItemProvider(this);
		}

		return colonneDeriveeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.ContenuFloat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenuFloatItemProvider contenuFloatItemProvider;

	/**
	 * This creates an adapter for a {@link table.ContenuFloat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContenuFloatAdapter() {
		if (contenuFloatItemProvider == null) {
			contenuFloatItemProvider = new ContenuFloatItemProvider(this);
		}

		return contenuFloatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.ContenuInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenuIntItemProvider contenuIntItemProvider;

	/**
	 * This creates an adapter for a {@link table.ContenuInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContenuIntAdapter() {
		if (contenuIntItemProvider == null) {
			contenuIntItemProvider = new ContenuIntItemProvider(this);
		}

		return contenuIntItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.ContenuBool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenuBoolItemProvider contenuBoolItemProvider;

	/**
	 * This creates an adapter for a {@link table.ContenuBool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContenuBoolAdapter() {
		if (contenuBoolItemProvider == null) {
			contenuBoolItemProvider = new ContenuBoolItemProvider(this);
		}

		return contenuBoolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.ContenuString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenuStringItemProvider contenuStringItemProvider;

	/**
	 * This creates an adapter for a {@link table.ContenuString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContenuStringAdapter() {
		if (contenuStringItemProvider == null) {
			contenuStringItemProvider = new ContenuStringItemProvider(this);
		}

		return contenuStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.Ou} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OuItemProvider ouItemProvider;

	/**
	 * This creates an adapter for a {@link table.Ou}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOuAdapter() {
		if (ouItemProvider == null) {
			ouItemProvider = new OuItemProvider(this);
		}

		return ouItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.Et} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtItemProvider etItemProvider;

	/**
	 * This creates an adapter for a {@link table.Et}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEtAdapter() {
		if (etItemProvider == null) {
			etItemProvider = new EtItemProvider(this);
		}

		return etItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.PredicatValeur} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicatValeurItemProvider predicatValeurItemProvider;

	/**
	 * This creates an adapter for a {@link table.PredicatValeur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicatValeurAdapter() {
		if (predicatValeurItemProvider == null) {
			predicatValeurItemProvider = new PredicatValeurItemProvider(this);
		}

		return predicatValeurItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link table.PredicatColonne} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicatColonneItemProvider predicatColonneItemProvider;

	/**
	 * This creates an adapter for a {@link table.PredicatColonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicatColonneAdapter() {
		if (predicatColonneItemProvider == null) {
			predicatColonneItemProvider = new PredicatColonneItemProvider(this);
		}

		return predicatColonneItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (tableItemProvider != null) tableItemProvider.dispose();
		if (colonneItemProvider != null) colonneItemProvider.dispose();
		if (colonneProvientItemProvider != null) colonneProvientItemProvider.dispose();
		if (colonneDeriveeItemProvider != null) colonneDeriveeItemProvider.dispose();
		if (contenuFloatItemProvider != null) contenuFloatItemProvider.dispose();
		if (contenuIntItemProvider != null) contenuIntItemProvider.dispose();
		if (contenuBoolItemProvider != null) contenuBoolItemProvider.dispose();
		if (contenuStringItemProvider != null) contenuStringItemProvider.dispose();
		if (ouItemProvider != null) ouItemProvider.dispose();
		if (etItemProvider != null) etItemProvider.dispose();
		if (predicatValeurItemProvider != null) predicatValeurItemProvider.dispose();
		if (predicatColonneItemProvider != null) predicatColonneItemProvider.dispose();
	}

}
