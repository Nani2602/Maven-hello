package htutman.sample;

/**
 * Message class used for API responses.
 *
 * @author Hrvoje Tutman
 */
public class Message {
  private String message;

  public Message() {
    super();
  }

  public Message(String mes) {
	  this();
	  this.message = mes;
  }
  
  public String getMessage() {
    return this.message;
  }

  public void setMessage(String mes) {
    this.message = mes;
  }
}
