package tech.adventureworks.humanresources.api.utils.converters;

import java.util.stream.Stream;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import tech.adventureworks.humanresources.api.model.types.Gender;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, Character> {

  @Override
  public Character convertToDatabaseColumn(Gender gender) {
    if (gender == null)
      return null;

    return gender.getGenero();
  }

  @Override
  public Gender convertToEntityAttribute(Character genero) {
    if (genero == null)
      return null;

    return Stream.of(Gender.values()).filter(c -> c.getGenero().equals(genero)).findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }


}
