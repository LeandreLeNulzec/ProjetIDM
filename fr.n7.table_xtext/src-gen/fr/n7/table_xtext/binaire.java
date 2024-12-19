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
 * A representation of the literals of the enumeration '<em><b>binaire</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.n7.table_xtext.Table_xtextPackage#getbinaire()
 * @model
 * @generated
 */
public enum binaire implements Enumerator
{
  /**
   * The '<em><b>Addition</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADDITION_VALUE
   * @generated
   * @ordered
   */
  ADDITION(0, "Addition", "sum"),

  /**
   * The '<em><b>Soustraction</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUSTRACTION_VALUE
   * @generated
   * @ordered
   */
  SOUSTRACTION(1, "Soustraction", "sub"),

  /**
   * The '<em><b>Division</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIVISION_VALUE
   * @generated
   * @ordered
   */
  DIVISION(2, "Division", "div"),

  /**
   * The '<em><b>Multiplication</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULTIPLICATION_VALUE
   * @generated
   * @ordered
   */
  MULTIPLICATION(3, "Multiplication", "mult");

  /**
   * The '<em><b>Addition</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADDITION
   * @model name="Addition" literal="sum"
   * @generated
   * @ordered
   */
  public static final int ADDITION_VALUE = 0;

  /**
   * The '<em><b>Soustraction</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUSTRACTION
   * @model name="Soustraction" literal="sub"
   * @generated
   * @ordered
   */
  public static final int SOUSTRACTION_VALUE = 1;

  /**
   * The '<em><b>Division</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIVISION
   * @model name="Division" literal="div"
   * @generated
   * @ordered
   */
  public static final int DIVISION_VALUE = 2;

  /**
   * The '<em><b>Multiplication</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MULTIPLICATION
   * @model name="Multiplication" literal="mult"
   * @generated
   * @ordered
   */
  public static final int MULTIPLICATION_VALUE = 3;

  /**
   * An array of all the '<em><b>binaire</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final binaire[] VALUES_ARRAY =
    new binaire[]
    {
      ADDITION,
      SOUSTRACTION,
      DIVISION,
      MULTIPLICATION,
    };

  /**
   * A public read-only list of all the '<em><b>binaire</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<binaire> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>binaire</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static binaire get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      binaire result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>binaire</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static binaire getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      binaire result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>binaire</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static binaire get(int value)
  {
    switch (value)
    {
      case ADDITION_VALUE: return ADDITION;
      case SOUSTRACTION_VALUE: return SOUSTRACTION;
      case DIVISION_VALUE: return DIVISION;
      case MULTIPLICATION_VALUE: return MULTIPLICATION;
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
  private binaire(int value, String name, String literal)
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
  
} //binaire