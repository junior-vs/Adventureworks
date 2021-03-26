package tech.adventureworks.humanresources.api.utils.converters;

import java.util.stream.Stream;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import tech.adventureworks.humanresources.api.model.types.MaritalStatus;

@Converter(autoApply = true)
public class MaritalStatusConverter implements AttributeConverter<MaritalStatus, Character> {

  @Override
  public Character convertToDatabaseColumn(MaritalStatus status) {
    if (status == null)
      return null;

    return status.getStatus();
  }

  @Override
  public MaritalStatus convertToEntityAttribute(Character status) {
    if (status == null)
      return null;

    return Stream.of(MaritalStatus.values()).filter(c -> c.getStatus().equals(status)).findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }


}
