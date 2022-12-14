fun findByIndex(names: Set<String>): String {
    return when {
        names.contains("Alice") && names.contains("Victor") -> "${names.indexOf("Alice")}, ${names.indexOf("Victor")}"
        names.contains("Alice") -> "${names.indexOf("Alice")}"
        names.contains("Victor") -> "${names.indexOf("Victor")}"
        else -> ""
    }
}