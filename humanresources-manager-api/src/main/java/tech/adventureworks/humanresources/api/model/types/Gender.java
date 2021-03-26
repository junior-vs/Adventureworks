package tech.adventureworks.humanresources.api.model.types;

public enum Gender {

  MALE('M'), FEMALE('F');

  private Character genero;

  private Gender(Character genero) {
    this.genero = genero;
  }

  public Character getGenero() {
    return genero;
  }



}
