package mediator;

/**
 * Created by androidjp on 16/8/19.
 */
public abstract class Colleague {
  protected Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

}
