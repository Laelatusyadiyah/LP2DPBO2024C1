// deklarasi class
class Clothing extends Product {

    // attibut private bertipe data string
    private String size;
    private String material;
    private String gender;

    // constructor tanpa parameter
    public Clothing() {
        this.size = "";
        this.material = "";
        this.gender = "";

    }

    // constructor dengan parameter size, nama, gender
    public Clothing(String size, String material, String gender) {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    // setter dan getter untuk setiap atribut size, nama, gender
    public String get_size() {
        return this.size;
    }

    public void set_size(String size) {
        this.size = size;
    }

    public String get_material() {
        return this.material;
    }

    public void set_material(String material) {
        this.material = material;
    }

    public String get_gender() {
        return this.gender;
    }

    public void set_gender(String gender) {
        this.gender = gender;
    }

};
