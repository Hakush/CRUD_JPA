package logica;

/**
 * Class Experiencia_Laboral
 */
public class Experiencia_Laboral {

  //
  // Fields
  //
    
    private int id;
  private String position;
  private String company;
  private String imgsrc;
  private String description;
  private String ref;
  private int start;
  private int end;
  
  //
  // Constructors
  //
  
  /**
   * @param id
 * @param position
 * @param company
 * @param imgsrc
 * @param description
 * @param ref
 * @param start
 * @param end
 */
  public Experiencia_Laboral(int id, String position, String company, String imgsrc, String description, String ref, int start,
		int end) {
	super();
        this.id = id;
	this.position = position;
	this.company = company;
	this.imgsrc = imgsrc;
	this.description = description;
	this.ref = ref;
	this.start = start;
	this.end = end;
  }

  //
  // Methods
  //

    public int getId () {
        return id;
    }

    //
    // Accessor methods
    //
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set the value of position
     * @param newVar the new value of position
     */
    public void setPosition(String newVar) {
        position = newVar;
    }

  /**
   * Get the value of position
   * @return the value of position
   */
  public String getPosition () {
    return position;
  }

  /**
   * Set the value of company
   * @param newVar the new value of company
   */
  public void setCompany (String newVar) {
    company = newVar;
  }

  /**
   * Get the value of company
   * @return the value of company
   */
  public String getCompany () {
    return company;
  }

  /**
   * Set the value of imgsrc
   * @param newVar the new value of imgsrc
   */
  public void setImgsrc (String newVar) {
    imgsrc = newVar;
  }

  /**
   * Get the value of imgsrc
   * @return the value of imgsrc
   */
  public String getImgsrc () {
    return imgsrc;
  }

  /**
   * Set the value of description
   * @param newVar the new value of description
   */
  public void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
  public String getDescription () {
    return description;
  }

  /**
   * Set the value of ref
   * @param newVar the new value of ref
   */
  public void setRef (String newVar) {
    ref = newVar;
  }

  /**
   * Get the value of ref
   * @return the value of ref
   */
  public String getRef () {
    return ref;
  }

  /**
   * Set the value of start
   * @param newVar the new value of start
   */
  public void setStart (int newVar) {
    start = newVar;
  }

  /**
   * Get the value of start
   * @return the value of start
   */
  public int getStart () {
    return start;
  }

  /**
   * Set the value of end
   * @param newVar the new value of end
   */
  public void setEnd (int newVar) {
    end = newVar;
  }

  /**
   * Get the value of end
   * @return the value of end
   */
  public int getEnd () {
    return end;
  }

  //
  // Other methods
  //

    @Override
    public String toString() {
        return "Experiencia_Laboral{" + "id=" + id + ", position=" + position + ", company=" + company + ", imgsrc=" + imgsrc + ", description=" + description + ", ref=" + ref + ", start=" + start + ", end=" + end + '}';
    }

}
