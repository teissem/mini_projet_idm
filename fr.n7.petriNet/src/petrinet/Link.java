/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Link#getWeight <em>Weight</em>}</li>
 *   <li>{@link petrinet.Link#isPositive <em>Positive</em>}</li>
 *   <li>{@link petrinet.Link#getPlace <em>Place</em>}</li>
 *   <li>{@link petrinet.Link#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see petrinet.PetrinetPackage#getLink_Weight()
	 * @model required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link petrinet.Link#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive</em>' attribute.
	 * @see #setPositive(boolean)
	 * @see petrinet.PetrinetPackage#getLink_Positive()
	 * @model required="true"
	 * @generated
	 */
	boolean isPositive();

	/**
	 * Sets the value of the '{@link petrinet.Link#isPositive <em>Positive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive</em>' attribute.
	 * @see #isPositive()
	 * @generated
	 */
	void setPositive(boolean value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see petrinet.PetrinetPackage#getLink_Transition()
	 * @model required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link petrinet.Link#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see petrinet.PetrinetPackage#getLink_Place()
	 * @model required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link petrinet.Link#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // Link
