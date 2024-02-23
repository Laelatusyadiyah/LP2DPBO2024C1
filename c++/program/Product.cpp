// import library
#include <iostream>
#include <string>

using namespace std;

// deklarasi class menjadi anak dari Shirt
class Product
{

    // attibut private bertipe data string
private:
    string idProduct;
    string nama;
    string brand;
    string price;

    // public Methods
public:
    // constructor tanpa parameter
    Product()
    {
        this->idProduct = "";
        this->nama = "";
        this->brand = "";
        this->price = "";
    }

    // constructor
    Product(string idProduct, string nama, string brand, string price)
    {
        this->idProduct = idProduct;
        this->nama = nama;
        this->brand = brand;
        this->price = price;
    }

    // setter dan getter
    string get_idProduct()
    {
        return this->idProduct;
    }

    void set_idProduct(string idPoduct)
    {
        this->idProduct = idPoduct;
    }

    string get_nama()
    {
        return this->nama;
    }

    void set_nama(string nama)
    {
        this->nama = nama;
    }

    string get_brand()
    {
        return this->brand;
    }

    void set_brand(string brand)
    {
        this->brand = brand;
    }

    string get_price()
    {
        return this->price;
    }

    void set_price(string price)
    {
        this->price = price;
    }

    // deconstructor
    ~Product()
    {
    }
};
