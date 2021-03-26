package tech.adventureworks.humanresources.api.model.types;

public enum PayFrequency {

  MONTHLY((short) 1), BIWEEKLY((short) 2);

  private Short frequency;

  private PayFrequency(Short frequency) {
    this.frequency = frequency;
  }

  public Short getFrequency() {
    return frequency;
  }

}
