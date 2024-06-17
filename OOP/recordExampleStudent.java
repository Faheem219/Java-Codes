package OOP;

// The constructor is implicitly part of a record, though it does not implicitly have getters
// instead they can directly be accessed using their name, but no setters as its supposed to be immutable
public record recordExampleStudent(String id, String name, String dateOfBirth, String classList) {
}
