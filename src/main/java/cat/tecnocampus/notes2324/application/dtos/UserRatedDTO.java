package cat.tecnocampus.notes2324.application.dtos;

public record UserRatedDTO(long id,
                           String name,
                           String email,
                            long numberOfNotes) {
}
