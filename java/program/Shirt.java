// deklarasi class dan menjadi anak Product
class Shirt extends Clothing {

    // attibut private bertipe data string
    private String color;
    private String sleeve_type;

    // constructor tanpa parameter
    public Shirt() {
        this.color = "";
        this.sleeve_type = "";

    }

    // constructor dengan parameter color, sleeve_type
    public Shirt(String color, String sleeve_type) {
        this.color = color;
        this.sleeve_type = sleeve_type;
    }

    // setter dan getter untuk setiap atribut color, sleevetype
    public String get_color() {
        return this.color;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public String get_sleeve_type() {
        return this.sleeve_type;
    }

    public void set_sleeve_type(String sleeve_type) {
        this.sleeve_type = sleeve_type;
    }

};
