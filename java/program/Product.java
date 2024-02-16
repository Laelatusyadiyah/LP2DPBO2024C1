// deklarasi class
class Product extends Shirt {

    // attibut private bertipe data string
    private String idProduct;
    private String nama;
    private String brand;
    private String price;

    // constructor tanpa parameter
    public Product() {
        this.idProduct = "";
        this.nama = "";
        this.brand = "";
        this.price = "";

    }

    // constructor dengan parameter idProduct, nama, brand
    public Product(String idProduct, String nama, String brand, String price) {
        this.idProduct = idProduct;
        this.nama = nama;
        this.brand = brand;
        this.price = price;

    }

    // setter dan getter untuk setiap atribut idProduct, nama, brand, dan price
    public String get_idProduct() {
        return this.idProduct;
    }

    public void set_idProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String get_nama() {
        return this.nama;
    }

    public void set_nama(String nama) {
        this.nama = nama;
    }

    public String get_brand() {
        return this.brand;
    }

    public void set_brand(String brand) {
        this.brand = brand;
    }

    public String get_price() {
        return this.price;
    }

    public void set_price(String price) {
        this.price = price;
    }

};