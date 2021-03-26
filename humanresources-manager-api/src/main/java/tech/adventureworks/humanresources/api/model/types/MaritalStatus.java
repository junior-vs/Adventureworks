package tech.adventureworks.humanresources.api.model.types;

public enum MaritalStatus {

  MARRIED('M'), SINGLE('S');

  private Character status;

  private MaritalStatus(Character status) {
    this.status = status;
  }

  public Character getStatus() {
    return status;
  }



}
