/**
 * generated by Xtext 2.32.0
 */
package fr.n7.table_xtext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.n7.table_xtext.Table_xtextPackage#getCondition()
 * @model
 * @generated
 */
public enum Condition implements Enumerator
{
  /**
   * The '<em><b>Inferieur Ou Egal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFERIEUR_OU_EGAL_VALUE
   * @generated
   * @ordered
   */
  INFERIEUR_OU_EGAL(0, "InferieurOuEgal", "<="),

  /**
   * The '<em><b>Inferieur Strict</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFERIEUR_STRICT_VALUE
   * @generated
   * @ordered
   */
  INFERIEUR_STRICT(1, "InferieurStrict", "<"),

  /**
   * The '<em><b>Egal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EGAL_VALUE
   * @generated
   * @ordered
   */
  EGAL(2, "Egal", "="),

  /**
   * The '<em><b>Superieur Strict</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPERIEUR_STRICT_VALUE
   * @generated
   * @ordered
   */
  SUPERIEUR_STRICT(3, "SuperieurStrict", ">"),

  /**
   * The '<em><b>Superieur Ou Egal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPERIEUR_OU_EGAL_VALUE
   * @generated
   * @ordered
   */
  SUPERIEUR_OU_EGAL(4, "SuperieurOuEgal", ">=");

  /**
   * The '<em><b>Inferieur Ou Egal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFERIEUR_OU_EGAL
   * @model name="InferieurOuEgal" literal="&lt;="
   * @generated
   * @ordered
   */
  public static final int INFERIEUR_OU_EGAL_VALUE = 0;

  /**
   * The '<em><b>Inferieur Strict</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFERIEUR_STRICT
   * @model name="InferieurStrict" literal="&lt;"
   * @generated
   * @ordered
   */
  public static final int INFERIEUR_STRICT_VALUE = 1;

  /**
   * The '<em><b>Egal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EGAL
   * @model name="Egal" literal="="
   * @generated
   * @ordered
   */
  public static final int EGAL_VALUE = 2;

  /**
   * The '<em><b>Superieur Strict</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPERIEUR_STRICT
   * @model name="SuperieurStrict" literal="&gt;"
   * @generated
   * @ordered
   */
  public static final int SUPERIEUR_STRICT_VALUE = 3;

  /**
   * The '<em><b>Superieur Ou Egal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPERIEUR_OU_EGAL
   * @model name="SuperieurOuEgal" literal="&gt;="
   * @generated
   * @ordered
   */
  public static final int SUPERIEUR_OU_EGAL_VALUE = 4;

  /**
   * An array of all the '<em><b>Condition</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Condition[] VALUES_ARRAY =
    new Condition[]
    {
      INFERIEUR_OU_EGAL,
      INFERIEUR_STRICT,
      EGAL,
      SUPERIEUR_STRICT,
      SUPERIEUR_OU_EGAL,
    };

  /**
   * A public read-only list of all the '<em><b>Condition</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Condition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Condition</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Condition get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Condition result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Condition</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Condition getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Condition result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Condition</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Condition get(int value)
  {
    switch (value)
    {
      case INFERIEUR_OU_EGAL_VALUE: return INFERIEUR_OU_EGAL;
      case INFERIEUR_STRICT_VALUE: return INFERIEUR_STRICT;
      case EGAL_VALUE: return EGAL;
      case SUPERIEUR_STRICT_VALUE: return SUPERIEUR_STRICT;
      case SUPERIEUR_OU_EGAL_VALUE: return SUPERIEUR_OU_EGAL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Condition(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Condition