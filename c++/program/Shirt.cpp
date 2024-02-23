// import library
#include <iostream>
#include <string>
#include "Clothing.cpp"

using namespace std;

// deklarasi class menjadi anak dari Clothing
class Shirt : public Clothing
{

    // attibut private bertipe data string
private:
    string color;
    string sleeve_type;

    // public Methods
public:
    // constructor tanpa parameter
    Shirt()
    {
        this->color = "";
        this->sleeve_type = "";
    }

    // constructor
    Shirt(string color, string sleeve_type)
    {
        this->color = color;
        this->sleeve_type = sleeve_type;
    }

    // setter dan getter
    string get_color()
    {
        return this->color;
    }

    void set_color(string color)
    {
        this->color = color;
    }

    string get_sleeve_type()
    {
        return this->sleeve_type;
    }

    void set_sleeve_type(string sleeve_type)
    {
        this->sleeve_type = sleeve_type;
    }

    // deconstructor
    ~Shirt()
    {
    }
};
