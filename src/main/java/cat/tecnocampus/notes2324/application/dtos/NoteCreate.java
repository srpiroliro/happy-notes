package cat.tecnocampus.notes2324.application.dtos;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

// TODO 1.1: you may need to add some annotations here
public record NoteCreate(
        long noteId,

        @Pattern(regexp = "^[A-ZÀ-ÿ][A-Za-zÀ-ÿ .,;:_'-]*$", message = "Title must begin with a capital letter. Also only letters are allowed")
        @Size(min = 5, max = 100, message = "size must be between 5 and 100")
        String title,

        
        @Pattern(regexp = "^[A-ZÀ-ÿ][A-Za-zÀ-ÿ0-9 .,;:_'-]*$", message = "Title must begin with a capital letter.")
        @Size(min = 5, max = 100, message = "size must be between 5 and 100")
        String content,
        List<String> tags) {
}
