package feature.characters.domain;

public class CharacterModel {

    private String id;
    private String name;
    private String genre;
    private String skinColor;
    private String age;

    public CharacterModel(String id, String name, String genre, String skinColor, String age) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.skinColor = skinColor;
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
