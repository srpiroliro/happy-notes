package cat.tecnocampus.notes2324.application.dtos;

import java.time.LocalDateTime;
import java.util.List;

public record NoteDTO(long id,
                      String title,
                      String content, LocalDateTime creationDate, List<TagDTO> tags) {
}
