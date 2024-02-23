// import library
#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

// deklarasi kelas
class Clothing : public Product
{

    // attibut private bertipe data string
private:
    string size;
    string material;
    string gender;

    // public Methods
public:
    // constructor tanpa parameter
    Clothing()
    {
        this->size = "";
        this->material = "";
        this->gender = "";
    }

    // constructor
    Clothing(string size, string material, string gender)
    {
        this->size = size;
        this->material = material;
        this->gender = gender;
    }

    // setter dan getter
    string get_size()
    {
        return this->size;
    }

    void set_size(string size)
    {
        this->size = size;
    }

    string get_material()
    {
        return this->material;
    }

    void set_material(string material)
    {
        this->material = material;
    }

    string get_gender()
    {
        return this->gender;
    }

    void set_gender(string gender)
    {
        this->gender = gender;
    }

    // deconstructor
    ~Clothing()
    {
    }
};
