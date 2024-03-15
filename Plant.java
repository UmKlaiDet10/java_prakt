class Plant {
    String name;

    public Plant(String name) {
        this.name = name;
    }

    public void filter() {
        String newName = name.replaceAll("[aeiouAEIOU]", ""); // удаляем гласные буквы
        newName += "VGTBL"; // добавляем "VGTBL" в конец
        name = newName;
    }

    @Override
    public String toString() {
        return name;
    }
}
